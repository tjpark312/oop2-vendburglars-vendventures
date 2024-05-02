package vendingMachine.controller;

import Manager.ManagerController;
import Manager.ManagerRepository;
import Manager.entity.controller.*;

import java.util.Scanner;

public class VendingMachine
{
    ManagerController managerController = new ManagerController();

    Scanner scanner = new Scanner(System.in);
    private boolean loginCheck = false;


    public void choiceUser()
    {
        String menu = """
                안녕하세요. 자판기입니다.
                1. 관리자
                2. 소비자
                     
                메뉴를 입력해주세요 : """;
        System.out.println(menu);
    }

    public boolean startManager(String name, String password) {
        ManagerRepository managerRepository = new ManagerRepository();
        ManagerController managerController1 = new ManagerController();
        managerController1.registerManager();
        return managerRepository.logIn(name, password);


    }

    public void startCustomer() {
    }
}
