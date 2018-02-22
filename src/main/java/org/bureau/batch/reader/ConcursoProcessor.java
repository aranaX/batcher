package org.bureau.batch.reader;

import org.springframework.batch.item.ItemProcessor;

class ConcursoProcessor implements ItemProcessor<ConcursoDTO, String> {

	@Override
	public String process(ConcursoDTO concursoDTO) {
		String result;
		
		result = "la descripcion es : " + concursoDTO.getNo() + " - " + concursoDTO.getTipoDeEntidadPadre() + "\n";
		
		return result;
	}

}
