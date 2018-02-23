package org.bureau.batch.reader;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Entidad {
	@GraphId Long nodeId;
	@Index(unique=true, primary=true) 
	private String entidadCompradora;
	private String tipoDeEntidadPadre;
	private String tipoDeEntidad;
	private String unidadCompradora;
	@Relationship(type="PUBLICA_UN")
	private Publica publicaUn;
	
	public Entidad(String entidadCompradora, String tipoDeEntidadPadre, String tipoDeEntidad,
			String unidadCompradora) {
		this.entidadCompradora = entidadCompradora;
		this.tipoDeEntidadPadre = tipoDeEntidadPadre;
		this.tipoDeEntidad = tipoDeEntidad;
		this.unidadCompradora = unidadCompradora;
	}	
}
