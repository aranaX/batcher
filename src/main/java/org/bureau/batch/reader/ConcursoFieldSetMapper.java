package org.bureau.batch.reader;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

class ConcursoFieldSetMapper implements FieldSetMapper<ConcursoDTO> {
	private final static Logger LOGGER = Logger.getLogger(ConcursoFieldSetMapper.class.getName());

	@Override
	public ConcursoDTO mapFieldSet(FieldSet fieldSet) throws BindException {

		ConcursoDTO concursoDTO = new ConcursoDTO();
		DateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			concursoDTO.setNo(fieldSet.readLong(0));
			concursoDTO.setTipoDeEntidadPadre(fieldSet.readString(1));
			concursoDTO.setTipoDeEntidad(fieldSet.readString(2));
			concursoDTO.setEntidadCompradora(fieldSet.readString(3));
			concursoDTO.setUnidadCompradora(fieldSet.readString(4));
			concursoDTO.setNogConcurso(fieldSet.readLong(5));
			concursoDTO.setDescripcion(fieldSet.readString(6));
			concursoDTO.setModalidad(fieldSet.readString(7));
			concursoDTO.setSubModalidad(fieldSet.readString(8));
			concursoDTO.setNit(fieldSet.readString(9));
			concursoDTO.setNombre(fieldSet.readString(10));
			concursoDTO.setMonto(fieldSet.readBigDecimal(11));
			concursoDTO.setFechaDePublicacion(inputFormat.parse(fieldSet.readString(12)));
			concursoDTO.setMesDePublicacion(fieldSet.readString(13));
			concursoDTO.setAnioDePublicacion(fieldSet.readString(14));
			concursoDTO.setFechaDeUltimaAdjudicacion(inputFormat.parse(fieldSet.readString(15)));
			concursoDTO.setFechaDeAdjudicacion(inputFormat.parse(fieldSet.readString(16)));
			concursoDTO.setAnioDeAdjudicacion(fieldSet.readString(17));
			concursoDTO.setCategorias(fieldSet.readString(18));
			concursoDTO.setEstatusDelConcurso(fieldSet.readRawString(19));

		} catch (ParseException e) {
			LOGGER.log(Level.WARN, "Parse error : " + e.getMessage());
		}

		return concursoDTO;
	}

}
