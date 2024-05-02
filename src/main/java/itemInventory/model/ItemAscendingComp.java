package itemInventory.model;

import java.util.Comparator;

public class ItemAscendingComp implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getClass().toString().compareTo(o2.getClass().toString()) + o1.getName().compareTo(o2.getName());
    }
}
