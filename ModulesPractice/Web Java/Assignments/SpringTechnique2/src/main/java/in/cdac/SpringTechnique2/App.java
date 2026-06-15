package in.cdac.SpringTechnique2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.cdac.secondtechnique.beans.Users;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
    	try(ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans.xml")){
        	Users objUser = (Users)applicationContext.getBean(Users.class);
        	System.out.println(objUser);
        }
    }
}
