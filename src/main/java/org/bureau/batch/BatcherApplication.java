package org.bureau.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatcherApplication {

	public static void main(String[] args) {
		System.out.println("hola mundo");
		SpringApplication.run(BatcherApplication.class, args);
	}

}
