package org.bureau.batch.reader;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type="SE_ADJUDICA")
public class Adjudica {
	@GraphId private Long relationshipId;
	@Property private Date fechaAdjudicacion;
	@StartNode private Concurso concurso;
	@EndNode private Persona persona;	
}
