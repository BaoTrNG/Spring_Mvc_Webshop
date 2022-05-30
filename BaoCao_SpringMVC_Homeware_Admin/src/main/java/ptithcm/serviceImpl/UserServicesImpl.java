package ptithcm.serviceImpl;

import ptithcm.dao.UserDao;
import ptithcm.daoImpl.UserDaoImpl;
import ptithcm.model.User;
import ptithcm.service.UserService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    UserDao userDao = new UserDaoImpl();

    @Override
    public void insert(User user) {
        userDao.insert(user);
    }

    @Override
    public void edit(User newUser) {
        User oldUSer = userDao.get(newUser.getId());
        oldUSer.setName(newUser.getName());
        oldUSer.setEmail(newUser.getEmail());
        oldUSer.setPhone(newUser.getPhone());
        oldUSer.setUsername(newUser.getUsername());
        oldUSer.setPassword(newUser.getPassword());
        oldUSer.setCreated(newUser.getCreated());
        userDao.edit(oldUSer);

    }

    @Override
    @Transactional
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);

    }

    @Override
    @Transactional
    public User get(int id) {
        return userDao.get(id);
    }

    @Override
    public User get(String name) {
        // TODO Auto-generated method stub
        return null;
    }

}
