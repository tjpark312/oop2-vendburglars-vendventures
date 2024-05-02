package taejun.repository.managerRepo;

import taejun.data.Manager;

import java.util.ArrayList;
import java.util.List;


public class ManagerRepository {
    private Manager manager;
    private List<Manager> managers;

    public ManagerRepository(Manager manager) {
        this.manager = manager;

    }

    public void save(String email, String name, String password) {
        Manager newManager = new Manager(email, name, password);
        if (manager == null) {
            managers = new ArrayList<>();
        }
        managers.add(newManager);
    }


    public boolean login(String email, String password) {
        if (manager.getEmail().equals(email) && manager.getPassword().equals(password)) {
            return true;
        }
        return false;


    }

    public boolean changePassword(String newPassword) {
        manager.setPassword(newPassword);


        return true;
    }




}


