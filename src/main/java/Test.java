import itemInventory.dto.ItemDto;

import java.util.List;

public class Test {
    public static void main(String[] args) {


        //홍지민
        //SportDrink
        ItemDto itemDtoH1 = new ItemDto(3000, "2%", 500, 130, "LOTTE" ,
                0, "cold", "SportDrink", List.of("peach"));

        ItemDto itemDtoH2 = new ItemDto(2500, "링티 제로", 500, 0, "Samyang" ,
                0, "cold", "SportDrink", List.of("lemon"));

        ItemDto itemDtoH3 = new ItemDto(3500, "토레타", 500, 83, "The Coca-Cola Company" ,
                0, "cold", "SportDrink", List.of("vegetable"));

        ItemDto itemDtoH4 = new ItemDto(2000, "파워에이드", 600, 83, "The Coca-Cola Company" ,
                0, "cold", "SportDrink", List.of("vegetable"));



        ItemDto itemDto01 = new ItemDto(40000, "JACK DANIEL", 700, 1553, "Jack Daniel Distillery", 0, "cold", "Alcohol", List.of(40.0));


        ItemDto itemDto2 = new ItemDto(1400, "진로 이즈백", 360, 400, "하이트 진로", 0, "cold", "Alcohol", List.of(16.5));


        ItemDto itemDto3 = new ItemDto(1600, "필라이트", 500, 400, "하이트 진로", 0, "cold", "Alcohol", List.of(16.5));

        ItemDto itemDto4 = new ItemDto(2500, "Kirin Ichiban",500, 154,"Kirin Brewery", 0,  "cold", "Alcohol", List.of(5.0));

    }
}
