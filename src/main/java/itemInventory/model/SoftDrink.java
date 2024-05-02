package itemInventory.model;

public class SoftDrink extends Item{

    public SoftDrink() {
    }

    public SoftDrink(int price, String name, int volume, int calorie, String manufacturer, int caffeine, String temperature, int quantity) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature, quantity);
    }
}
