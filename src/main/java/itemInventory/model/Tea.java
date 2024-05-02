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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Tea{" +
                super.toString() +
                "kind='" + kind + '\'' +
                '}';
    }

}
