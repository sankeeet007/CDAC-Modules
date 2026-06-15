package in.cdac.SpringTechnique1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cdac.firsttechnique.beans.Users;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try(ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml")){
        	Users objUsers = (Users)applicationContext.getBean("objUsers");
        	System.out.println(objUsers);
        }
    }
}
