package vendingMachine;

public class VendingMachine {
    private String location = "도곡동";
    private int inventory;
    private int money;

    public VendingMachine() {
    }

    public VendingMachine(String location, int inventory, int money) {
        this.location = location;
        this.inventory = inventory;
        this.money = money;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
