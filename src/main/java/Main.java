
import itemInventory.controller.ItemController;
import itemInventory.dto.ItemDto;
import itemInventory.model.Item;
import itemInventory.repository.ItemRepository;
import vendingMachine.controller.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int sum = 0;
    static ItemRepository itemRepository = new ItemRepository();
    static ItemController itemController = new ItemController(itemRepository);
    static List<Item> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static VendingMachine vendingMachine = new VendingMachine();
    private static boolean loginCheck = false;

    public static void main(String[] args) {
        List<Object> details = List.of("Ethiopian Yirgacheffe", "water", "espresso");
        ItemDto itemDto = new ItemDto(100, "americano", 500, 32, "starbucks" ,
                324, "cold", "Coffee", details);
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
                case 2:
                    customerStart();
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
        itemController.updateQuantity(item.getName(),item.getVolume(),-1);
    }

    /*
        String email, password, newPassword, choice;

        Scanner scanner = new Scanner(System.in);
        ManagerController managerController = new ManagerController();

        // 관리자 한명 등록해놓고 시작
        managerController.registerManager();

        // 관리자 로그인
        System.out.println("============= 로그인 ==============");
        System.out.println("관리자의 이메일을 입력하세요. ");
        email = scanner.next();
        System.out.println("관리자의 비밀번호를 입력하세요. ");
        password = scanner.next();
        if(managerController.logIn(email, password)) {
            System.out.println("로그인 되었습니다.");
        }
        else {
            System.out.println("이메일 또는 비밀번호가 잘못 입력되었습니다.");
        }

        // 관리자 비밀번호 변경
        System.out.println("============= 비밀번호 변경 ==============");
        System.out.println("관리자의 이메일을 입력하세요. ");
        email = scanner.next();
        System.out.println("관리자의 비밀번호를 입력하세요. ");
        password = scanner.next();
        System.out.println("새로 변경할 비밀번호를 입력하세요. ");
        newPassword = scanner.next();
        if(managerController.changePassword(email, password, newPassword)) {
            System.out.println("비밀번호가 변경되었습니다.");
        }
        else {
            System.out.println("이메일 또는 비밀번호가 잘못 입력되었습니다.");
        }

        // 관리자 로그아웃
        System.out.println("============= 로그아웃 ==============");
        System.out.println("로그아웃 하시겠습니까?\n" + "1. 예 " + "2. 아니요 ");
        choice = scanner.next();
        if(choice.equals("1")) {
            managerController.logOut();
            System.out.println("로그아웃 되었습니다.");
        }
    }

     */
}
