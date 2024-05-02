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
        SportDrink((i) -> {
            if (!i.isEmpty()) {
                return new SportDrink((String) i.get(0));
            }
            return new SportDrink();
        }),
        Tea((i) -> {
            if (!i.isEmpty()) {
                return new Tea((String) i.get(0));
            }
            return new Tea();
        }),
        Alcohol((i) -> {
            if (!i.isEmpty()) {
                return new Alcohol((float) i.get(0));
            }
            return new Alcohol();
        }),
        Coffee((i) ->
        {
            if (!i.isEmpty()) {
                return new Coffee((String) i.get(0), getSubList(i,1, i.size()));
            }
            return new Coffee();
        });
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