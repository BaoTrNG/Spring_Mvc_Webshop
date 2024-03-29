package ptithcm.serviceImpl;

import ptithcm.dao.AdminDao;
import ptithcm.daoImpl.AdminDaoImpl;
import ptithcm.model.Admin;
import ptithcm.service.AdminService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServicesImpl implements AdminService {

    @Autowired
    AdminDao adminDao = new AdminDaoImpl();

    @Override
    public void insert(Admin admin) {
        adminDao.insert(admin);
    }

    @Override
    public void edit(Admin admin) {
        Admin oldAdmin = adminDao.get(admin.getId());
        oldAdmin.setUsername(admin.getUsername());
        oldAdmin.setPassword(admin.getPassword());
        oldAdmin.setName(admin.getName());
        adminDao.edit(oldAdmin);

    }

    @Override
    public void delete(String id) {
        adminDao.delete(id);

    }

    @Override
    @Transactional
    public Admin get(int id) {
        return adminDao.get(id);
    }

    @Override
    @Transactional
    public Admin get(String name) {
        return adminDao.get(name);
    }

    @Override
    @Transactional
    public List<Admin> getAll() {
        return adminDao.getAll();
    }
}
