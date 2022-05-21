package ptithcm.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ptithcm.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

@Transactional
@Controller
public class UserController 
{
	@Autowired
	SessionFactory factory;
	
	@RequestMapping("shop")
    public String index(ModelMap model, HttpServletRequest request) 
	{
		
		Session session  = factory.openSession();
	
		String hql = " FROM User ";
		
		Query query = session.createQuery(hql);

	    List<User> list = query.list();
	  //  System.out.println(list.get(0).getName()+" "+ list.get(0).getLogin()+" "+ list.get(0).getPass() +list.get(0).getType());
	  //  System.out.println(list.get(1).getName());
	 
	    model.addAttribute("users", list);

		session.close(); 
		return "Site/Shop";
	}  
	
	@RequestMapping(params = "save")
	public void Reload(ModelMap model,
			@RequestParam("login")String Log,
			@RequestParam("pass")String Pass,
			@RequestParam("ten")String User,
			@RequestParam("phone")String Phone,
			@RequestParam("email")String Email)
	{
		System.out.println("ewqewewqeqqeqwed");
		Session session  = factory.openSession();
		User user = new User(Log,Pass,User,Phone,Email);
		session.save(user); 
		session.close();
	    System.out.println(user.getName());
	}
}
