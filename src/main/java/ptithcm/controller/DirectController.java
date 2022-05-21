package ptithcm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;
//import ptithcm.dao.UserDao;
//import ptithcm.model.User;

@Controller
public class DirectController 
{
	
	@RequestMapping("about")
	public String About() 
	{
		return"Site/about";
	}
	
	@RequestMapping("contact")
	public String contact() 
	{
		return"Site/Contact";
	}
	
	@RequestMapping("user")
	public String User() 
	{
		return"Site/User/User";
	}
	
	@RequestMapping("login")
	public String login() 
	{
		return"Site/User/Login";
	}
	
}