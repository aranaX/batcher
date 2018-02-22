package org.bureau.batch.reader;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

class ConcursoWriter implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> concursoDescripcion) throws Exception {
		System.out.println(concursoDescripcion);
	}

}
