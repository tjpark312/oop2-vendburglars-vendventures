//import controller.ManagerController;
//import itemInventory.controller.ItemController;
//import itemInventory.dto.ItemDto;
//import itemInventory.repository.ItemRepository;
//import itemInventory.util.ItemFactory;
//import repository.ManagerRepository;
//import vendingMachine.controller.VendingMachine;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//import static java.util.List.of;
//
//public class application {
//
//    public static void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//
//        ItemController itemController = new ItemController(new ItemRepository());
//
//        VendingMachine vendingMachineController = new VendingMachine();
//
//        ManagerController managerController = new ManagerController(new ManagerRepository());
//
//        // 초기 메뉴 추가
//
//        // 예
//        List<Object> details = List.of("Ethiopian Yirgacheffe", "water", "espresso");
//        ItemDto itemDto = new ItemDto(100, "americano", 500, 32, "starbucks" ,
//                324, "cold", "Coffee", details);
//        try {
//            itemController.insertItem(itemDto);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        String initialMessage = """
//                안녕하세요.  자판기입니다.
//                1. 관리자
//                2. 소비자
//
//                메뉴를 입력해주세요 : """;
//
//        // register manager
//        System.out.println("""
//                    자판기를 시작합니다. 관리자를 등록해주세요.
//                    """);
//        managerController.registerManager();
//
//        while(true) {
//
//            System.out.println(initialMessage);
//
//            int cmd = scanner.nextInt();
//
//            switch (cmd) {
//                case 1:
//                    vendingMachineController.startManager();
//                    break;
//                case 2:
//                    System.out.println(itemController.listItems());
//                    vendingMachineController.startCustomer();
//                    break;
//            }
//
//
//        }
//
//
//
//
//
//    }
//}
