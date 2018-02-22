package org.bureau.batch.reader;

import org.springframework.batch.item.ItemProcessor;

class ConcursoProcessor implements ItemProcessor<ConcursoDTO, Persona> {

	@Override
	public Persona process(ConcursoDTO concursoDTO) {
		Persona persona = new Persona(concursoDTO.getNit(), concursoDTO.getNombre());
				
		return persona;
	}

}
