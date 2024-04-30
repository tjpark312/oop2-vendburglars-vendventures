package controller;

import repository.ManagerRepository;

public class ManagerController {
    private ManagerRepository managerRepository = new ManagerRepository();

    public void logIn(String email, String password) {
        managerRepository.logIn(email, password);
    }

    public void changePassword(String email, String password, String newPassword) {
        managerRepository.changePassword(email, password, newPassword);
    }
}
