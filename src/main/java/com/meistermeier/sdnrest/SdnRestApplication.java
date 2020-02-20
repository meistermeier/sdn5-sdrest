package com.meistermeier.sdnrest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.meistermeier.sdnrest.user.User;
import com.meistermeier.sdnrest.user.UserRepository;

@SpringBootApplication
public class SdnRestApplication implements CommandLineRunner {

	private final UserRepository repository;

	public SdnRestApplication(UserRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SdnRestApplication.class, args);
	}

	@Override public void run(String... args) {
		repository.save(new User("John", "Foo", "johnny92"));
	}
}
