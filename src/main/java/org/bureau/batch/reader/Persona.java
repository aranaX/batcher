package org.bureau.batch.reader;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Persona {
	@GraphId Long nodeId;
	@Index(unique=true, primary=true) 
	private String nit;
	private String nombre;
	
	Persona(String nit, String nombre){
		this.nit = nit;
		this.nombre = nombre;
	}
}
