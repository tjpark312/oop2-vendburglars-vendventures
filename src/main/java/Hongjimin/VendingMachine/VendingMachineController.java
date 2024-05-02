package vendingMachine;

import itemInventory.InventoryController;
import manager.ManagerController;

import java.util.Scanner;

public class VendingMachineController {
    ManagerController managerController = new ManagerController();
    VendingMachineController vendingMachineController = new VendingMachineController();
    Scanner scanner = new Scanner(System.in);

    public void choiceUser() {
// 이거 왜 있어야 하는지 모르겠는 메소드
    }

    public boolean loginCheck() {
        boolean success = managerController.logIn();
        return success;
    }

    public void orderItem(String name, int volume){
        InventoryController inventoryController = new InventoryController();
        inventoryController.updateItem();
    }

    public void startManager() {
        boolean success = vendingMachineController.loginCheck();
        if(success) {
            // 매니저 로그인 성공 후에, 매니저 메뉴를 어디서 보여줘야되는지 몰라서 일단 여기다 적음
            System.out.println("""
                                === 메뉴를 선택해주세요 ===
                                1. 재고 관리
                                2. 매출 관리
                                3. 비밀번호 변경
                                ========================
                               """);
            String choice = scanner.next();
            switch (choice) {
                case "1" :
                    break;

                case "2" :
                    vendingMachineController.checkMoney();
                    break;
                case "3" :

            }
        }
        else{

        }

    }

    public void startCustomer() {
        System.out.println("=== 구매하실 상품을 선택해주세요 ===");
        String name = scanner.next();

        System.out.println("=== 수량을 선택해주세요 === ");
        int volume = scanner.nextInt();
        vendingMachineController.orderItem(name, volume);
    }

    public int checkMoney() {
        return 3;
    }
}
