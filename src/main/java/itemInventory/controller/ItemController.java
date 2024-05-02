package itemInventory.controller;


import itemInventory.dto.ItemDto;
import itemInventory.model.Item;
import itemInventory.repository.ItemRepository;
import itemInventory.util.ItemFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ItemController {


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

    public void saveItem(ItemDto itemDto) throws Exception {


        Item item = ItemFactory.createItem(ItemFactory.ItemEnum.valueOf(itemDto.getKind()), itemDto.getDetails());
        item.setCaffeine(itemDto.getCaffeine());
        item.setManufacturer(itemDto.getManufacturer());
        item.setName(itemDto.getName());
        item.setPrice(itemDto.getPrice());
        item.setVolume(itemDto.getVolume());
        item.setTemperature(item.getTemperature());
        item.setCalorie(item.getCalorie());

        itemRepository.save(item);
    }

    public void updateQuantity(String name, int volume, int quantity) {

        itemRepository.updateQuantity(name, volume,quantity);
    }

    public int checkQuantity(String name, int volume) {
        return itemRepository.findByNameAndVolume(name, volume).getQuantity();
    }

//    public void updateItem(ItemDto itemDto) {
//
//    }


}
