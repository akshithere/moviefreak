package moviefreak.moviefreak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviefreakApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviefreakApplication.class, args);
		
	}
}
