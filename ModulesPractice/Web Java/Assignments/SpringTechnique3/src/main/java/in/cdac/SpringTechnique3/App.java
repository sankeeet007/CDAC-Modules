package in.cdac.SpringTechnique3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.cdac.initializer.AppConfigurator;
import in.cdac.thirdtechnique.beans.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try(ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfigurator.class)){
        	Users objUser = (Users)context.getBean("objUser");
        	System.out.println(objUser);
        }
    }
}
