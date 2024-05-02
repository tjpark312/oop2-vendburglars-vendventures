import Manager.entity.controller.ManagerController;
import vendingMachine.controller.VendingMachine;

import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    static VendingMachine vendingMachine = new VendingMachine();
    private static boolean loginCheck = false;

    public static void main(String[] args) {

    while(true)
    {
        vendingMachine.choiceUser();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                managerStart();
//                vendingMachine.startManager();
            case 2:
                vendingMachine.startCustomer();
        }
        }
    }

    public static void managerStart(){
        while(!loginCheck){
            System.out.println("관리자 로그인");
            System.out.print("이메일 : ");
            String email = scanner.next();
            System.out.print("비밀번호 : ");
            String password = scanner.next();

            loginCheck = vendingMachine.startManager(email,password);

        }

    }
