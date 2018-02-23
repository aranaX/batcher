package org.bureau.batch.reader;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Concurso {
	@GraphId Long nodeId;	
	private long nogConcurso;
	private String descripcion;
	private String modalidad;
	private String subModalidad;
	
	@Relationship(type="SE_ADJUDICA")
	private Adjudica seAdjudica;

	public Concurso(long nogConcurso, String descripcion, String modalidad, String subModalidad) {
		this.nogConcurso = nogConcurso;
		this.descripcion = descripcion;
		this.modalidad = modalidad;
		this.subModalidad = subModalidad;
	}

}
