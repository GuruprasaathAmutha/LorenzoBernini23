package selvan.ponniyin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"selvan.sasi.Controller", "selvan.sasi.Repo"})
public class LorenzoBernini23Application {

	public static void main(String[] args) {
		SpringApplication.run(LorenzoBernini23Application.class, args);
	}

}
