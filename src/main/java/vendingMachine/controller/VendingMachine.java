package vendingMachine.controller;

import Manager.ManagerController;
import Manager.ManagerRepository;
import itemInventory.controller.ItemController;
import itemInventory.dto.ItemDto;


import java.util.List;
import java.util.Scanner;

public class VendingMachine
{
    private ItemController itemController;
    private int price;
    public VendingMachine(ItemController itemController) {
        this.itemController = itemController;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
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
    public void checkMoney() {
        System.out.println("매출내역입니다 : " + getPrice() + "원");
    }
    public void addItem() throws Exception {
        List<Object> details = List.of("Ethiopian Yirgacheffe", "water", "espresso");
        ItemDto item = new ItemDto(100, "americano", 500, 32, "starbucks" ,
                324, "cold", "Coffee", details);
        itemController.insertItem(item);
        System.out.println(item.getName() + "이(가) 상품 목록에 추가되었습니다.");
    }
    public void deleteItem(String name, int volume) {
        itemController.deleteByNameAndVolume(name, volume);
        System.out.printf("%s(%dml)이(가) 상품 목록에서 삭제되었습니다", name, volume);
    }
}
