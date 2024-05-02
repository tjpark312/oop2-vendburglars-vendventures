package itemInventory.item;

public class Coffee extends Item{

    public Coffee() {
    }

    public Coffee(int price, String name, int volume, int calorie, String manufacturer, int caffeine, char temperature, int amount) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature, amount);
    }

    Coffee [] coffees = {
            new Coffee(1500, "아메리카노", 500, 20, "칸타타", 30, 'I', 20),
            new Coffee(2000, "카페 라떼", 500, 150, "칸타타", 30, 'I', 20)
    };

}
