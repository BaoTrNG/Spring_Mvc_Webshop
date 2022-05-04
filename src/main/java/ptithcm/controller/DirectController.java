package ptithcm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DirectController 
{
	@RequestMapping("shop")
	public String Shop() 
	{
		return"Site/Shop";
	}
	
	@RequestMapping("about")
	public String About() 
	{
		return"Site/about";
	}
}