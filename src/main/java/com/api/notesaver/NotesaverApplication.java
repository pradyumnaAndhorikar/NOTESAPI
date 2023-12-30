package com.api.notesaver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class NotesaverApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesaverApplication.class, args);
	}

}
