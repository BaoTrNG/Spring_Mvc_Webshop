package ptithcm.adminController;

import ptithcm.model.Ordered;
import ptithcm.model.Product;
import ptithcm.service.OrderedService;
import ptithcm.service.ProductService;
import ptithcm.serviceImpl.OrderedServiceImpl;
import ptithcm.serviceImpl.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin/order")
public class OrderdetailListController {
	private static final long serialVersionUID = 1L;
        
        @Autowired
	OrderedService orderedServcie = new OrderedServiceImpl();
        
        @Autowired
	ProductService productService = new ProductServiceImpl();
	@GetMapping("/list-detail") 
	public String listOrderDetails(Model theModel){ 
		List<Ordered> orderedList = orderedServcie.getAll(); 
		theModel.addAttribute("orderedlist", orderedList);
		List<Product> products = new ArrayList<Product>();
		for(Ordered ordered: orderedList)
		{
			Product product = new Product();
			product = productService.get(ordered.getProduct_id());
			products.add(product);
		}
		theModel.addAttribute("products", products); 
                return "show-orderdetail";
	}
}
