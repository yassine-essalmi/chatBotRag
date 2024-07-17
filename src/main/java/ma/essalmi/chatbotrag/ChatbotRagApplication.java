package ma.essalmi.chatbotrag;

import ma.essalmi.chatbotrag.Repository.PersonRepository;
import ma.essalmi.chatbotrag.entities.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class ChatbotRagApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatbotRagApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(PersonRepository personRepository){
		return args -> {
			for (int i= 0; i < 10; i++) {
				personRepository.save(Person.builder()
						.name(UUID.randomUUID().toString().substring(0, 5))
						.email(UUID.randomUUID().toString().substring(0, 5) + "@gmail.com")
						.build());
			}
		};
	}
}
