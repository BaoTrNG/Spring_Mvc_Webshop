package ptithcm.controller;

import ptithcm.model.Boardnew;
import ptithcm.service.BoardnewService;
import ptithcm.serviceImpl.BoardnewServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/client")
public class BoardnewListClientController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
        @Autowired
	BoardnewService boardnewService = new BoardnewServicesImpl();
	
        @GetMapping("/news-list")
	public String boardNews(Model theModel) {
		List<Boardnew> boardnewList = boardnewService.getAll();
		theModel.addAttribute("boardnewlist", boardnewList);
                return "blog-archive";
	}

}
