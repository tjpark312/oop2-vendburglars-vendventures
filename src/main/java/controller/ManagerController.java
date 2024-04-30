package controller;

import repository.ManagerRepository;

public class ManagerController {
    private ManagerRepository managerRepository = new ManagerRepository();

    public void logIn(String email, String password) {
        managerRepository.logIn(email, password);
    }
}
