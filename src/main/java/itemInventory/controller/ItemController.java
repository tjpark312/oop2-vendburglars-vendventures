package controller;

import dto.ItemDto;
import model.Item;
import repository.ItemRepository;
import util.ItemEnum;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ItemController {

    class ClassName<T> {

        private T element;

        void set(T element) {
            this.element = element;
        }

        T get() {
            return element;
        }

    }

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {
        return itemRepository.findAll();

    }

    public List<Item> findAllByName(String name) {
        return itemRepository.findAllByName(name);

    }

    public Item findByNameAndVolume(String name, int volume) {
        return itemRepository.findByNameAndVolume(name, volume);

    }

    public List<Item> findAllByKind(String kind){
        return itemRepository.findAllByKind(kind);
    }

    public void deleteByNameAndVolume(String name, int volume) {

        itemRepository.deleteByNameAndVolume(name, volume);
    }

    public void saveItem(ItemDto itemDto) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<? extends Item> type = ItemEnum.valueOf(itemDto.getKind()).getType();
        Item item =
                type.getConstructor().newInstance();
        item.setCaffeine(itemDto.getCaffeine());
        item.setManufacturer(itemDto.getManufacturer());
        item.setName(itemDto.getName());
        item.setPrice(itemDto.getPrice());
        item.setVolume(itemDto.getVolume());
        item.setTemperature(item.getTemperature());
        item.setCalorie(item.getCalorie());


        itemRepository.save(item);
    }

//    public void updateItem(ItemDto itemDto) {
//
//    }


}
