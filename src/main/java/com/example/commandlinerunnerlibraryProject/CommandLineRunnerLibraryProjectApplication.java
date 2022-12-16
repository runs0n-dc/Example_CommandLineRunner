package com.example.commandlinerunnerlibraryProject;

import com.example.commandlinerunnerlibraryProject.Repository.LibCardRepository;
import com.example.commandlinerunnerlibraryProject.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerLibraryProjectApplication implements CommandLineRunner {
   @Autowired
	StudentRepo sr;
   @Autowired
	LibCardRepository lcr;
	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunnerLibraryProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s=new Student("Messi",32);
		LibCard card=new LibCard(21);
		lcr.save(card);
		s.setCard(card);
		sr.save(s);

	}
}
