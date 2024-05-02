package itemInventory.repository;

import itemInventory.model.Item;
import itemInventory.util.ItemFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemRepository {

    private List<Item> inventory;

    public List<Item> findAll() {
        return inventory;
    }

    public List<Item> findAllByName(String name) {
        return inventory.stream().filter(item -> item.getName().equals(name)).toList();
    }

    public Item findByNameAndVolume(String name, int volume) {
        Optional<Item> item = inventory.stream().filter(i ->
                i.getName().equals(name) && i.getVolume() == volume).findAny();
        if(item.isEmpty()) {
            throw new RuntimeException("Not Found!");
        }
        return item.get();
    }

    public List<Item> findAllByKind(String kind) {
        return inventory.stream().filter(item ->
                item.getClass().equals(ItemFactory.ItemEnum.valueOf(kind).getType())).toList();
    }

    public void deleteByNameAndVolume(String name, int volume) {
        Item item = findByNameAndVolume(name, volume);
        inventory.remove(item);
    }

    public void save(Item item) throws Exception {
        if(inventory == null) {
            inventory = new ArrayList<>();
        }
        if(inventory.contains(item)) {
            throw new Exception("Item is already exist!");
        }
        inventory.add(item);
    }


    public void updateQuantity(String name, int volume, int quantity) {

        Item found = findByNameAndVolume(name,volume);

        found.setQuantity(quantity);
    }
}
