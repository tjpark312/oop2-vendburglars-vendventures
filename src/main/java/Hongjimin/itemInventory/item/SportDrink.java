package itemInventory.item;

public class SportDrink extends Item{
    public SportDrink() {
    }

    public SportDrink(int price, String name, int volume, int calorie, String manufacturer, int caffeine, char temperature, int amount) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature, amount);
    }

    SportDrink [] SportDrinks = {
            new SportDrink(2500, "2%", 500, 20, "해태", 30, 'I', 20),
            new SportDrink(2500, "토레타", 500, 150, "농심", 30, 'I', 20)
    };
}
