package com.example.demo;

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
		Board board = new Board(16, "caluroso");
		System.out.println("temperatura:"+board.getTemp());
		System.out.println("Texto:"+board.getText());
	}
	
}

@RestController
//@RequestMapping("/boards")
class WeatherRestController {
	
	@RequestMapping("/boards")
	Board test() {
		Board board = new Board(16, "caluroso");
		return board;
	}
}


