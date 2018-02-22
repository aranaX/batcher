package org.bureau.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ComponentScan("org.bureau.batch.reader")
@EnableNeo4jRepositories("org.bureau.batch.reader")
@SpringBootApplication
public class BatcherApplication {

	public static void main(String[] args) {
		System.out.println("hola mundo");
		SpringApplication.run(BatcherApplication.class, args);
	}

}
