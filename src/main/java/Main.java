
import itemInventory.controller.ItemController;
import itemInventory.dto.ItemDto;
import itemInventory.model.Item;
import itemInventory.repository.ItemRepository;
import manager.controller.ManagerController;
import manager.repository.ManagerRepository;
import vendingMachine.controller.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int sum = 0;
    static ItemRepository itemRepository = new ItemRepository();
    static ItemController itemController = new ItemController(itemRepository);
    static ManagerRepository managerRepository = new ManagerRepository();
    static ManagerController managerController = new ManagerController(managerRepository);
    static List<Item> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    private static boolean loginCheck = false;
    public static VendingMachine vendingMachine = new VendingMachine(itemController, managerController);

    public static void main(String[] args) {

        ItemDto itemDto = new ItemDto(3500, "americano", 500, 32, "Starbucks" ,
                150, "cold", "Coffee", 10,List.of("Ethiopian Yirgacheffe", "water", "espresso"));

        ItemDto itemDto2 = new ItemDto(5500, "Sea Salt Caramel Cold Brew", 355, 32, "Starbucks" ,
                130, "cold", "Coffee", 12,List.of(""));

        ItemDto itemDto3 = new ItemDto(1500, "Coca Cola", 500, 250, "The Coca-Cola Company" ,
                324, "cold", "SoftDrink", 13, List.of(""));

        ItemDto itemDto4 = new ItemDto(1500, "Monster Energy", 473 , 160 , "Monster Beverage Corporation" ,
                160 , "cold", "SportDrink", 15, List.of(""));

        ItemDto itemDto5 = new ItemDto(1800, "Monster Energy", 650  , 160 , "Monster Beverage Corporation" ,
                60, "cold", "SportDrink",13, List.of("Tea"));
        ItemDto itemDto6 = new ItemDto(2500, "Kirin Ichiban",500, 154,"Kirin Brewery", 0,  "cold", "Alcohol", 16,List.of(5.0));

        ItemDto itemDto7 = new ItemDto(1300, "Lipton Iced Tea",500, 270,"Lipton", 0,  "cold", "Tea", 17, List.of("Peach"));

        try {
            itemController.insertItem(itemDto);
            itemController.insertItem(itemDto2);
            itemController.insertItem(itemDto3);
            itemController.insertItem(itemDto4);
            itemController.insertItem(itemDto5);
            itemController.insertItem(itemDto6);
            itemController.insertItem(itemDto7);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // 관리자 등록
        managerController.registerManager();

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
        3. 비밀번호 변경하기
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
            case 3:
                System.out.println("============= 비밀번호 변경 ==============");
                System.out.println("관리자의 이메일을 입력하세요. ");
                String email = scanner.next();
                System.out.println("관리자의 비밀번호를 입력하세요. ");
                String password = scanner.next();
                System.out.println("새로 변경할 비밀번호를 입력하세요. ");
                String newPassword = scanner.next();
                if(managerController.changePassword(email, password, newPassword)) {
                    System.out.println("비밀번호가 변경되었습니다.");
                }
                else {
                    System.out.println("이메일 또는 비밀번호가 잘못 입력되었습니다.");
                }
                break;

        }
        loginCheck = !managerController.logOut();
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
