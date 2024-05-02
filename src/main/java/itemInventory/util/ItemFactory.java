package itemInventory.util;

import itemInventory.model.*;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ItemFactory {

    public static<T> List<String> getSubList(List<T> list, int startIndex, int endIndex) {
        return list.stream()
                .skip(startIndex)
                .limit(endIndex - startIndex + 1)
                .map(Object::toString)
                .collect(Collectors.toList());
    }
    public enum ItemEnum {

        SoftDrink((i) -> new SoftDrink()),
        SportDrink((i) -> new SportDrink((String) i.getFirst())),
        Tea((i) -> new Tea((String) i.getFirst())),
        Alcohol((i) -> new Alcohol((int) i.getFirst())),
        Coffee((i) -> new Coffee((String) i.getFirst(), getSubList(i,1, i.size())));
        ItemEnum(Function<List<Object>, Item> supplier) {
            item = supplier;
        }
        private Function<List<Object>, Item> item;
        public Function<List<Object>, Item> getItem() {
            return item;
        }
        public Class<? extends Item> getType() {
            return item.apply(List.of("")).getClass();
        }
    }
    public static Item createItem(ItemEnum kind, List<Object> values) {
        return kind.getItem().apply(values);
    }


}