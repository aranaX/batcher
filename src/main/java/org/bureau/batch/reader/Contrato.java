package org.bureau.batch.reader;

public class Contrato {
	private Entidad entidad;
	private Concurso concurso;
	private Persona persona;
	
	public Contrato(Entidad entidad, Concurso concurso, Persona persona) {
		this.entidad = entidad;
		this.concurso = concurso;
		this.persona = persona;
	}
	
	public Entidad getEntidad() {
		return entidad;
	}

	public Concurso getConcurso() {
		return concurso;
	}

	public Persona getPersona() {
		return persona;
	}

	
}
