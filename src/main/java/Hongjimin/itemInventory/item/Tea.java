package itemInventory.item;

public class Tea extends Item{
    public Tea() {
    }

    public Tea(int price, String name, int volume, int calorie, String manufacturer, int caffeine, char temperature, int amount) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature, amount);
    }

    Tea [] Teas = {
            new Tea(3500, "로즈마리 티", 500, 20, "컴포즈", 30, 'I', 20),
            new Tea(3500, "캐모마일 티", 500, 150, "컴포즈", 30, 'I', 20)
    };
}
