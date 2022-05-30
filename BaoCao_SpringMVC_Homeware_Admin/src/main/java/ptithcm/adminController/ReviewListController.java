package ptithcm.adminController;

import ptithcm.model.Review;
import ptithcm.service.ReviewService;
import ptithcm.serviceImpl.ReviewServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/review")
public class ReviewListController {

    private static final long serialVersionUID = 1L;
    @Autowired
    ReviewService reviewService = new ReviewServicesImpl();

    @GetMapping("/list")
    public String listReview(Model theModel) {
        List<Review> reviewList = reviewService.getAll();
        theModel.addAttribute("reviewlist", reviewList);
        return "show-review";
    }
}
