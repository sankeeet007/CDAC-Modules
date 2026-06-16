package in.cdac.BootMvcHiber.controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.cdac.BootMvcHiber.entity.Users;

@Controller
public class UsersController {
	
	@Autowired
	SessionFactory hibernateFactory;
	
	@RequestMapping("/login")
	public void prepareUser(Model data) {
		Users objUser = new Users();
		data.addAttribute("objUser", objUser);
	}
	
	@RequestMapping("/authenticate")
	public ModelAndView authenticateUser(@ModelAttribute("objUser") Users objUser) {
		try (Session hibernateSession = hibernateFactory.openSession()) {
			Users dbUser = (Users) hibernateSession.find(Users.class, objUser.getUserName());
			
			if(dbUser!=null && objUser.getPassword().equals(dbUser.getPassword())) {
				return new ModelAndView("welcome", "message", "Welcome to Spring Boot");
			}
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return new ModelAndView("login", "message", "Invalid crediantials!!!");
	}
}
