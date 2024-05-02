package vendingMachine.controller;

import domain.manager.Manager;
import domain.manager.inventory.Item;
import Manager.ManagerRepository;
import repository.VendingMachineRepository;

import java.util.List;
import java.util.Scanner;

public class VendingMachineController {

   InventoryController inventoryController =new InventoryController();

    List<Item> list ;
    Scanner scanner = new Scanner(System.in);
    private boolean loginCheck = false;
    public void choiceUser() {
        inventoryController.registerItem();
        list = inventoryController.findByAll();
        Scanner scanner = new Scanner(System.in);
        String menu = """
                안녕하세요. 자판기입니다.
                1. 관리자
                2. 소비자
                     
                메뉴를 입력해주세요 : """;
        System.out.println(menu);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                startManager();
                break;
            case 2:
                startCustomer();
                break;
        }
    }

    /**
     * 로그인 체크 -> 로그인이 되어있지 않다면 false 값인데 그럼
     */
    public void loginCheck(){
        if(loginCheck == false){//관리자가 로그인이 되어있지 않다면 ? -> 로그인 해야되니까

        }
    }


    public void startManager() {
        VendingMachineRepository vendingMachineRepository = new VendingMachineRepository();
        if (loginCheck == false) { // 로그인이 되어있지 않다면
            ManagerRepository managerRepository = new ManagerRepository();
            Manager manager = managerRepository.registerManager();

            // List<Manager> manager = new AraayList<>();
            //아이디랑 비밀번호
            while (true) {
                System.out.println("=====관리자 페이지입니다======");
                System.out.println("관리자 아이디 : ");
                String id = scanner.next();
                System.out.println("관리자 비밀번호 : ");
                int pwd = scanner.nextInt();

                if (!id.equals(manager.getId()) || pwd != manager.getPassword()) {
                    System.out.println("관리자의 아이디 또는 비밀번호가 일치하지 않습니다.");
                } else {
                    loginCheck = true;
                    System.out.println("로그인 되었습니다.");
                    break;
                }
            }

            // 상품 추가 , 재고 확인
            while (true) {
                String managerMenu = """
                        ===관리자 메뉴====
                        1. 재고 관리 
                        2. 총 매출 확인하기 
                        입력 : """;
                System.out.print(managerMenu);
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        inventoryManage();
                        break;
                    case 2:
                        //checkMoney();
                        break;
                    default:
                        System.out.println("번호를 1번과 2번중에 입력해주세요.");
                        break;
                }

            }

        }
    }

    /**
     *  public int checkMoney(){
     *         int money = 0;
     *         return money;
     *     }
     * @return
     */


    public void inventoryManage(){
        String managerMenu =
         """
         ===관리자 메뉴====
         1. 재고 확인하기
         2. 상품 추가 
         3. 뒤로 가기
         입력 : """;
        System.out.println(managerMenu);
        int num = scanner.nextInt();
        switch (num) {
            case 1 :
                inventoryCheck();
                break;
            case 2 :
                addItem();
                break;
            case 3 :
                break;
        }

    }
    public void inventoryCheck(){
//        inventoryController.registerItem();
        list = inventoryController.findByAll();
        System.out.println("=== 재고확인 =======================");
        for (Item item : list)
        {
            System.out.println("상품명: " + item.getName() + " 가격: " + item.getPrice() + " 재고량: " + item.getAmount());
            System.out.println("----------------------------------");
        }
    }

    public void addItem(){
        inventoryController.insertItem();
    }

    public void startCustomer()//orderitem
    {
        Item item;
        System.out.println("===메뉴 출력===");
        for (int i = 0; i < list.size(); i++) {
           item = list.get(i);
            System.out.println((i + 1)+ ". " + item.getName() + " " + item.getPrice() + "원");
        }
        System.out.println("주문할 메뉴를 입력해주세요.");
        int number = scanner.nextInt() - 1;
        switch(number) {
            case 1 :
                item = list.get(number);
                System.out.println("제품명 : " + item.getName() + " 가격 : " + item.getPrice());
                break;
            case 2 :
                item = list.get(number);
                System.out.println("제품명 : " + item.getName() + " 가격 : " + item.getPrice());
                break;
            case 3 :
                item = list.get(number);
                System.out.println("제품명 : " + item.getName() + " 가격 : " + item.getPrice());
                break;
            case 4 :
                item = list.get(number);
                System.out.println("제품명 : " + item.getName() + " 가격 : " + item.getPrice());
                break;
            case 5 :
                item = list.get(number);
                System.out.println("제품명 : " + item.getName() + " 가격 : " + item.getPrice());
                break;
        }
    }


}
