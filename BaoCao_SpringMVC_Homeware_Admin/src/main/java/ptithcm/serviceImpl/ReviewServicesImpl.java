package ptithcm.serviceImpl;

import ptithcm.dao.ReviewDao;
import ptithcm.daoImpl.ReviewDaoImpl;
import ptithcm.model.Review;
import ptithcm.service.ReviewService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReviewServicesImpl implements ReviewService {

    @Autowired
    ReviewDao reviewDao = new ReviewDaoImpl();

    @Override
    @Transactional
    public void insert(Review review) {
        reviewDao.insert(review);

    }

    @Override
    @Transactional
    public void edit(Review review) {
        // TODO Auto-generated method stub

    }

    @Override
    @Transactional
    public void delete(int id) {
        // TODO Auto-generated method stub
        reviewDao.delete(id);
    }

    @Override
    public Review get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Review get(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @Transactional
    public List<Review> getAll() {
        return reviewDao.getAll();
    }

    @Override
    @Transactional
    public List<Review> getReviewById(int id) {
        return reviewDao.getReviewById(id);
    }

}
