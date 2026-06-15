package in.cdac.HibernateAssignment1;


import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import in.cdac.entities.Users;
import in.cdac.entities.Category;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration hibernateConfiguration = new Configuration();
        hibernateConfiguration.configure("hbn.cfg.xml");
        hibernateConfiguration.addAnnotatedClass(Users.class);
        hibernateConfiguration.addAnnotatedClass(Category.class);
        
        try(
        SessionFactory sessionFactory = hibernateConfiguration.buildSessionFactory();
        Session hibernateSession = sessionFactory.openSession();
        	Scanner scanner = new Scanner(System.in)){
        	//question-1
//        	System.out.println(hibernateSession);
//        	System.out.println("Enter the username");
//        	String username = scanner.next();
//        	
//        	System.out.println("Enter the password");
//        	String password = scanner.next();
//
//        	System.out.println("Enter the name");
//        	String name = scanner.next();
//        	
//        	System.out.println("Enter the email");
//        	String email = scanner.next();
//        	
//        	Users objUsers = new Users(username, password, name, email);
//        	
//        	Transaction tx = hibernateSession.beginTransaction();
//        	
//        	hibernateSession.persist(objUsers);
//        	tx.commit();
//        	
//        	System.out.println("Record saved");
        	
        	//question-2
        	Query allCategoriesQuery = hibernateSession.createQuery("from Category", Category.class);
        	
        	List<Category> resultList = allCategoriesQuery.getResultList();
        	resultList.forEach(System.out::println);
        }catch (HibernateException he) {
			he.printStackTrace();
		}
    }
}
