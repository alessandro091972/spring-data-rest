package torre.alessandro.springdatarest;

import torre.alessandro.springdatarest.entity.User;
import torre.alessandro.springdatarest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User user = User.builder()
				.firstName("Edoardo")
				.lastName("Bianchi")
				.email("torre@gmail.com")
				.build();

		userRepository.save(user);

		User user1 = User.builder()
				.firstName("Mario")
				.lastName("Rossi")
				.email("rossi@gmail.com")
				.build();

		userRepository.save(user1);

		User user2 = User.builder()
				.firstName("Andrea")
				.lastName("Bianchi")
				.email("bianchi@gmail.com")
				.build();

		userRepository.save(user2);

		User user3 = User.builder()
				.firstName("Antonio")
				.lastName("Verdi")
				.email("verdi@gmail.com")
				.build();

		userRepository.save(user3);

		User user4 = User.builder()
				.firstName("Salvatore")
				.lastName("Brambilla")
				.email("brambilla@gmail.com")
				.build();

		userRepository.save(user4);

	}
}
