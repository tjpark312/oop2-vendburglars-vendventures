package itemInventory.model;
public class Alcohol extends Item{

    private float abv;

    public Alcohol(float abv) {
        this.abv = abv;
    }

    public Alcohol(int price, String name, int volume, int calorie, String manufacturer, int caffeine, String temperature, int quantity, float abv) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature, quantity);
        this.abv = abv;
    }

    public float getAbv() {
        return abv;
    }

    public void setAbv(float abv) {
        this.abv = abv;
    }
}
