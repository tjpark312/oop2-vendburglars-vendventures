package itemInventory.model;
public class SportDrink extends Item {
    private String types;

    public SportDrink(String types) {
        this.types = types;
    }

    public SportDrink(int price, String name, int volume, int calorie, String manufacturer, int caffeine, String temperature, int quantity, String types) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature, quantity);
        this.types = types;
    }
}
