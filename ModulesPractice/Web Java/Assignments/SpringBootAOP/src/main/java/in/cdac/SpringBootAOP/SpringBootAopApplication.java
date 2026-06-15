package in.cdac.SpringBootAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import in.cdac.SpringBootAOP.entity.Users;
import in.cdac.SpringBootAOP.services.UsersService;

@SpringBootApplication(scanBasePackages = { "in.cdac.SpringBootAOP" })
@EnableAspectJAutoProxy
public class SpringBootAopApplication implements CommandLineRunner {

	@Autowired
	UsersService usersService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String userName = "sankeeet";
		String password = "Sanket#1";

		boolean status = usersService.authenticate(new Users(userName, password));

		if (status) {
			System.out.println("Authenicated...");
		} else {
			System.out.println("Failed...");
		}
	}

}
