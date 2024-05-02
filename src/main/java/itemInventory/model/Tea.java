package itemInventory.model;

import java.util.List;

public class Tea extends Item {
    private String kind;

    public Tea(String kind) {
        this.kind = kind;
    }

    public Tea(int price, String name, int volume, int calorie, String manufacturer, int caffeine, String temperature, String kind) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature);
        this.kind = kind;
    }

}
