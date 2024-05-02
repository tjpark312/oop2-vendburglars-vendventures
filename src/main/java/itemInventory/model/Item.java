package itemInventory.model;

public class Item {
    private int price;

    private String name;

    private int volume;

    private int calorie;

    private String manufacturer;

    private int caffeine;

    private String temperature;

    private int quantity;

    public Item() {
    }

    public Item(int price, String name, int volume, int calorie, String manufacturer, int caffeine, String temperature, int quantity) {
        this.price = price;
        this.name = name;
        this.volume = volume;
        this.calorie = calorie;
        this.manufacturer = manufacturer;
        this.caffeine = caffeine;
        this.temperature = temperature;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "price=" + price +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", calorie=" + calorie +
                ", manufacturer='" + manufacturer + '\'' +
                ", caffeine=" + caffeine +
                ", temperature='" + temperature + '\'';
    }
}
