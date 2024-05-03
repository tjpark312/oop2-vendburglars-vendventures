package itemInventory.dto;

import java.util.List;

public class ItemDto {

    private int price;

    private String name;

    private int volume;

    private int calorie;

    private String manufacturer;

    private int caffeine;

    private String temperature;

    private String kind;
    private int quantity;
    private List<Object> details;

    public ItemDto() {
    }

    public ItemDto(int price, String name, int volume, int calorie, String manufacturer, int caffeine, String temperature, String kind,int quantity, List<Object> details) {
        this.price = price;
        this.name = name;
        this.volume = volume;
        this.calorie = calorie;
        this.manufacturer = manufacturer;
        this.caffeine = caffeine;
        this.temperature = temperature;
        this.kind = kind;
        this.quantity = quantity;
        this.details = details;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(int caffeine) {
        this.caffeine = caffeine;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public List<Object> getDetails() {
        return details;
    }

    public void setDetails(List<Object> details) {
        this.details = details;
    }
}
