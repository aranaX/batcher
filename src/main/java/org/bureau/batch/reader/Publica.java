package org.bureau.batch.reader;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type="PUBLICA_UN")
public class Publica {
	@GraphId private Long relationshipId;
	@Property private Date fechaPublicacion;
	@StartNode private Entidad entidad;
	@EndNode private Concurso concurso;
	
	public Publica(Date fechaPublicacion, Entidad entidad, Concurso concurso) {
		super();
		this.fechaPublicacion = fechaPublicacion;
		this.entidad = entidad;
		this.concurso = concurso;
	}
	
	

}
