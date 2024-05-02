package util;

import model.Alcohol;
import model.*;


public enum ItemEnum{
    SoftDrink(SoftDrink.class),
    SportDrink(SportDrink.class),
    Tea(Tea.class),
    Coffee(Coffee.class),
    Alcohol(Alcohol.class);


    private final Class<? extends Item> type;

    ItemEnum(Class<? extends Item> type) {
        this.type = type;
    }

    public Class<? extends Item> getType() {
        return type;
    }
}
