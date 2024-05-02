package itemInventory.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Item {
    private int price;
    private String name;
    private int volume; // ml
    private int calorie;
    private String manufacturer;
    private int caffeine;
    private char temperature;
    private int amount; // 개수

    List<Item> list = new ArrayList<>();


    public Item() {
    }


    public Item(int price, String name, int volume, int calorie, String manufacturer, int caffeine, char temperature, int amount) {
        this.price = price;
        this.name = name;
        this.volume = volume;
        this.calorie = calorie;
        this.manufacturer = manufacturer;
        this.caffeine = caffeine;
        this.temperature = temperature;
        this.amount = amount;
    }
}
