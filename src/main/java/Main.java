
import itemInventory.controller.ItemController;
import itemInventory.dto.ItemDto;
import itemInventory.model.Item;
import itemInventory.repository.ItemRepository;
import manager.controller.ManagerController;
import vendingMachine.controller.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int sum = 0;
    static ItemRepository itemRepository = new ItemRepository();
    static ItemController itemController = new ItemController(itemRepository);
    static ManagerController managerController = new ManagerController();
    static List<Item> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static boolean loginCheck = false;
    public static VendingMachine vendingMachine = new VendingMachine(itemController, managerController);

    public static void main(String[] args) {
        List<Object> details = List.of("Ethiopian Yirgacheffe", "water", "espresso");
        ItemDto itemDto = new ItemDto(100, "americano", 500, 32, "starbucks" ,
                324, "cold", "Coffee",20, details);
        try {
            itemController.insertItem(itemDto);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        while (true) {
            vendingMachine.choiceUser();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerStart();
//                vendingMachine.startManager();
                    break;
                case 2:
                    customerStart();
                    break;
            }
        }
    }

    public static void managerStart() {
        while (!loginCheck) {
            System.out.println("관리자 로그인");
            System.out.print("이메일 : ");
            String email = scanner.next();
            System.out.print("비밀번호 : ");
            String password = scanner.next();

            loginCheck = vendingMachine.startManager(email, password);
        }
        String managerMenu = """
        1. 매출 확인하기 
        2. 재고 확인하기 
        """;
        System.out.print(managerMenu + "입력 : ");
        int num = scanner.nextInt();
        switch(num) {
            case 1 :
                vendingMachine.checkMoney();
                break;
            case 2 :
                list = itemController.listItems();
                for(Item item : list) {
                    System.out.println("제품 이름 : " + item.getName() + " 제품 개수 : " + item.getQuantity());
                }
                break;
        }
    }

    public static void customerStart(){//메뉴 출력
      list = itemController.listItems();
      Item item;
        for (int i = 0; i < list.size(); i++) {
            item = list.get(i);
            System.out.println((i + 1)+ ". " + item.getName() + " " + item.getPrice() + "원");
        }
        
        System.out.println("주문할 메뉴를 입력해주세요.");
        int number = scanner.nextInt() - 1;
        item = list.get(number);
        System.out.println("제품명 : " + item.getName() + " 가격 : " + item.getPrice());
        sum += item.getPrice();
        vendingMachine.setPrice(sum);
        System.out.println(vendingMachine.getPrice());
        itemController.updateQuantity(item.getName(),item.getVolume(), item.getQuantity()-1);
    }

}
