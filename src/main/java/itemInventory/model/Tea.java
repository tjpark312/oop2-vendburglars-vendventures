package itemInventory.model;

import java.util.List;

public class Tea extends Item {
    private String kind;

    public Tea(String kind) {
        this.kind = kind;
    }

    public Tea(int price, String name, int volume, int calorie, String manufacturer, int caffeine, String temperature, int quantity, String kind) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature, quantity);
        this.kind = kind;
    }
}
