package org.bureau.batch.reader;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

class ConcursoFieldSetMapper implements FieldSetMapper<ConcursoDTO> {

	@Override
	public ConcursoDTO mapFieldSet(FieldSet fieldSet) throws BindException {
		
		ConcursoDTO concursoDTO = new ConcursoDTO();
		
		concursoDTO.setNo(fieldSet.readLong(0));
		concursoDTO.setTipoDeEntidadPadre(fieldSet.readString(1));

		return concursoDTO;
	}

}
