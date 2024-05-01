import vendingMachine.VendingMachineController;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachineController vendingMachineController = new VendingMachineController();

        while (true) {
            System.out.println("""
                    ==== User 선택을 해주세요 ====
                            1. 구매자
                            2. 관리자
                    ===========================
                    """);

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    vendingMachineController.startCustomer();
                    break;
                case "2":
                    vendingMachineController.startManager();
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요!");
            }
        }


    }
}