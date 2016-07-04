package me.rpatel;

import me.rpatel.anagram.AnagramChecker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnagramcheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnagramcheckApplication.class, args);
		new AnagramChecker();
	}
}
