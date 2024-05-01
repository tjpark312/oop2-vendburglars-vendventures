package manager;

import vendingMachine.VendingMachineController;

public class ManagerRepository {
    ManagerController managerController = new ManagerController();
    Manager[] managers = new Manager[10];


    public boolean logIn(String email, String password) {
        if (email.equals(managers[0].getEmail()) && password.equals(managers[0].getPassword())) {
            return true;
        } else {
            return false;
        }
    }


    public void changePassword(String email, String password, String newPassword) {
    }

    public boolean logOut() {
        return true;
    }

    public void save(Manager manager) {
        managers[0] = manager;
        managerController.logIn();
    }
}

