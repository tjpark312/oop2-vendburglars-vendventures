package controller;

import entity.Manager;
import repository.ManagerRepository;

public class ManagerController {
    private ManagerRepository managerRepository = new ManagerRepository();

    public void logIn(String email, String password) {
        managerRepository.logIn(email, password);
    }

    public void changePassword(String email, String password, String newPassword) {
        managerRepository.changePassword(email, password, newPassword);
    }

    public void logOut() {
        managerRepository.logOut();
    }

    public void registerManager() {
        managerRepository.save(new Manager("abcd@abcd.com", "1234", "김개똥"));
    }
}
