package org.bureau.batch.reader;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

class ConcursoWriter implements ItemWriter<Persona> {
	@Autowired
	PersonaRepository personaRepository;

	@Override
	public void write(List<? extends Persona> persona) throws Exception {
		personaRepository.save(persona);
		
		System.out.println(persona);
	}

}
