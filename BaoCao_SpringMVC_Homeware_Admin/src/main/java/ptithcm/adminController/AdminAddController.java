package ptithcm.adminController; 
 
import ptithcm.model.Admin;
import ptithcm.service.AdminService;
import ptithcm.serviceImpl.AdminServicesImpl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

 @Controller
 @RequestMapping("/admin/admin")
public class AdminAddController { 

	private static final long serialVersionUID = 1L; 
        @Autowired
	AdminService adminService = new AdminServicesImpl(); 
 
	@GetMapping("/add") 
	public String showFormAdd(){ 
                return "addadmin";
	} 
 
	@PostMapping("/add") 
	public String addAdmin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
		String admin_username = req.getParameter("admin-username"); 
		String admin_password = req.getParameter("admin-password"); 
		String admin_name = req.getParameter("admin-name"); 
		System.out.println("e \""+admin_username+"\" ");
		System.out.println("e pwd \""+admin_password+"\" ");
		System.out.println("e n \""+admin_name+"\" ");
		admin_username = admin_username.replaceAll("\\s", "");
		admin_password = admin_password.replaceAll("\\s", "");
		admin_name = admin_name.replaceAll("\\s", "");
		System.out.println("add \""+admin_username+"\" ");
		System.out.println("add pwd \""+admin_password+"\" ");
		System.out.println("add n \""+admin_name+"\" ");

		if(admin_username !="" || admin_password !="" || admin_name!="")
		{		
		Admin admin = new Admin(); 
		admin.setUsername(admin_username); 
		admin.setPassword(admin_password); 
		admin.setName(admin_name); 
		System.out.println("naniiiiiiiiiiiiiiii");
		adminService.insert(admin); 
		}        
	    return "redirect:/admin/admin/list";
	}
} 
