package itemInventory.item;

public class SoftDrink extends Item {
    public SoftDrink() {
    }

    public SoftDrink(int price, String name, int volume, int calorie, String manufacturer, int caffeine, char temperature, int amount) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature, amount);
    }

    SoftDrink[] softDrinks = {
            new SoftDrink(2000, "콜라", 500, 235, "코카콜라", 30, 'I', 20),
            new SoftDrink(2000, "사이다", 500, 235, "칠성", 30, 'I', 20)
    };
}
