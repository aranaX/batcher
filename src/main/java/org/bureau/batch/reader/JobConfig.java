package org.bureau.batch.reader;

import java.nio.charset.StandardCharsets;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.separator.DefaultRecordSeparatorPolicy;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableBatchProcessing
class JobConfig {
	
	@Autowired
	JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	DataSource dataSource;
		
	private String[] headers = { "NO","TIPO DE ENTIDAD PADRE","TIPO DE ENTIDAD", "ENTIDAD COMPRADORA",
		"UNIDAD COMPRADORA", "NOG CONCURSO", "DESCRIPCION","MODALIDAD", "SUB MODALIDAD", "NIT", "NOMBRE", "MONTO",
		"FECHA DE PUBLICACIÓN", "MES DE PUBLICACIÓN", "AÑO DE PUBLICACIÓN", "FECHA DE ULTIMA ADJUDICACIÓN",
		"FECHA DE ADJUDICACIÓN", "MES DE ADJUDICACIÓN", "AÑO DE ADJUDICACIÓN", "CATEGORÍAS", "ESTATUS DEL CONCURSO"
	};	

	@Bean
	FlatFileItemReader<ConcursoDTO> reader(){
		FlatFileItemReader<ConcursoDTO> reader = new FlatFileItemReader<ConcursoDTO>();
		reader.setResource(new ClassPathResource("input.csv"));
		reader.setEncoding(StandardCharsets.ISO_8859_1.displayName());
		reader.setLinesToSkip(1);
		reader.setRecordSeparatorPolicy(new DefaultRecordSeparatorPolicy("\""));
		reader.setLineMapper(new DefaultLineMapper<ConcursoDTO>() {{
			setLineTokenizer(new DelimitedLineTokenizer() {{
				setNames(headers);
			}});
			setFieldSetMapper(new ConcursoFieldSetMapper());
		}});
		return reader;
	}
	
	@Bean
	ConcursoProcessor concursoProcessor() {
		return new ConcursoProcessor();
	}
	
	@Bean
	ConcursoWriter concursoWriter() {
		return new ConcursoWriter();
	}
	
	@Bean
	Step step1() {
		return stepBuilderFactory.get("step1")
				.<ConcursoDTO, Persona> chunk(10)
				.reader(reader())
				.processor(concursoProcessor())				
				.writer(concursoWriter())
				.build();
	}
		
	@Bean
	Job importConcursoJob() {
		return jobBuilderFactory.get("importConcursoJob")
				.incrementer(new RunIdIncrementer())
				.flow(step1())
				.end()
				.build();				
	}
}
