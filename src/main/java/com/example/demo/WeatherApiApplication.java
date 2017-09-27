package com.example.demo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WeatherApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApiApplication.class, args);
	}
}

@Component
class WeatherCommandLineRunner implements CommandLineRunner{
	
	@Override
	public void run(String...args) throws Exception {
		System.out.println("holaaaaa mundoooo");
		for (Board b : this.boardRepository.findAll()) {
			System.out.println("temperatura:"+b.getTemp());
			System.out.println("Texto:"+b.getText());
		}
	}
	
	@Autowired
	BoardRepository boardRepository;
}

@RestController
//@RequestMapping("/boards")
class WeatherRestController {
	
	@RequestMapping("/boards")
	Collection<Board> boards() {
		return this.boardRepository.findAll();
	}
	
	@Autowired
	BoardRepository boardRepository;
}


