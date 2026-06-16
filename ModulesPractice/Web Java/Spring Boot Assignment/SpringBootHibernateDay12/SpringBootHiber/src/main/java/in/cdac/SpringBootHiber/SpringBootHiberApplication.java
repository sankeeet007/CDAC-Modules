package in.cdac.SpringBootHiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

import in.cdac.SpringBootHiber.entity.Users;


@SpringBootApplication
@EntityScan(basePackages = {"in.cdac.SpringBootHiber.entity"})
public class SpringBootHiberApplication implements CommandLineRunner {

	
	@Autowired
	SessionFactory hibernateFactory;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHiberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try (Session hibernateSession = hibernateFactory.openSession()) {
			Users objUser = (Users)hibernateSession.find(Users.class, "sankeeet");
			
			if(objUser!=null) {
				System.out.println(objUser);
			} else {
				System.out.println("No such User");
			}
		}
		
	}
}
