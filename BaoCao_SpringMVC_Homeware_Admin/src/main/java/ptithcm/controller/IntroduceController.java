package ptithcm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/client")
public class IntroduceController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
        @GetMapping("/introduce")
	public String getIntroduce() {
                return "introduce";
	}

}
