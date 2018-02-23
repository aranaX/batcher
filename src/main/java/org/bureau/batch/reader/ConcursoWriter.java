package org.bureau.batch.reader;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

class ConcursoWriter implements ItemWriter<Contrato> {
	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	ConcursoRepository concursoRepository;
	@Autowired
	EntidadRepository entidadRepository;
	

	@Override
	public void write(List<? extends Contrato> contratoLista) throws Exception {		
		for(Contrato contrato : contratoLista) {
			personaRepository.save(contrato.getPersona());
			concursoRepository.save(contrato.getConcurso());
			entidadRepository.save(contrato.getEntidad());				
		}		
	}

}
