package org.bureau.batch.reader;

import org.springframework.batch.item.ItemProcessor;

class ConcursoProcessor implements ItemProcessor<ConcursoDTO, Contrato> {

	@Override
	public Contrato process(ConcursoDTO concursoDTO) {
		Entidad entidad = new Entidad(concursoDTO.getEntidadCompradora(), concursoDTO.getTipoDeEntidadPadre(),
				concursoDTO.getTipoDeEntidad(), concursoDTO.getUnidadCompradora());
		
		Concurso concurso = new Concurso(concursoDTO.getNogConcurso(), concursoDTO.getDescripcion(), 
				concursoDTO.getModalidad(), concursoDTO.getSubModalidad());
						
		Persona persona = new Persona(concursoDTO.getNit(), concursoDTO.getNombre());
		
		Contrato contrato = new Contrato(entidad, concurso, persona);
				
		return contrato;
	}

}
