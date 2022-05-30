package ptithcm.adminController; 
 
import ptithcm.model.Admin;
import ptithcm.service.AdminService;
import ptithcm.serviceImpl.AdminServicesImpl;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
/** 
 * Servlet implementation class CategoryListController 
 */ 

@Controller
@RequestMapping("/admin/admin")
public class AdminListController { 
	/** 
	 *  
	 */ 
	private static final long serialVersionUID = 1L;
        @Autowired
	AdminService adminService = new AdminServicesImpl(); 
 
	@GetMapping("/list")
	public String listAdmin(Model theModel) { 
		List<Admin> adminList = adminService.getAll(); 
		theModel.addAttribute("adminlist", adminList); 
                return "admin";
	} 
}