package repository;

import model.Item;
import util.ItemEnum;

import java.awt.geom.NoninvertibleTransformException;
import java.util.List;
import java.util.Objects;
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
                item.getClass() == ItemEnum.valueOf(kind).getType()).toList();
    }

    public void deleteByNameAndVolume(String name, int volume) {
        Item item = findByNameAndVolume(name, volume);
        inventory.remove(item);
    }

    public void save(Item item) {
        inventory.add(item);
    }
}
