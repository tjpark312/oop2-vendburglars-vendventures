package manager.controller;

import manager.model.Manager;
import manager.repository.ManagerRepository;

public class ManagerController {
    private ManagerRepository managerRepository = new ManagerRepository();

    public boolean logIn(String email, String password) {
        return managerRepository.logIn(email, password);
    }

    public boolean changePassword(String email, String password, String newPassword) {
        return managerRepository.changePassword(email, password, newPassword);
    }

    public boolean logOut() {
        return managerRepository.logOut();
    }

    public void registerManager() {
        managerRepository.save(new Manager("a", "12", "김개똥"));
    }

}
