package ptithcm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/client")
public class ContactController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
        @GetMapping("/contact")
	public String getContact() {
                return "contact";
	}

}
