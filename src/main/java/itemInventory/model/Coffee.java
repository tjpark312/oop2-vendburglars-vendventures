package itemInventory.model;
import java.util.List;

public class Coffee extends Item{
    private String bean;
    private List<String> additions ;

    public Coffee(String bean, List<String> additions) {
        this.bean = bean;
        this.additions = additions;
    }

    public Coffee(int price, String name, int volume, int calorie, String manufacturer, int caffeine, String temperature, int quantity, String bean, List<String> additions) {
        super(price, name, volume, calorie, manufacturer, caffeine, temperature, quantity);
        this.bean = bean;
        this.additions = additions;
    }

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean;
    }

    public List<String> getAdditions() {
        return additions;
    }

    public void setAdditions(List<String> additions) {
        this.additions = additions;
    }

    public void addAddition(String addition) {
        additions.add(addition);
    }

    @Override
    public String toString() {
        return "Coffee{" + super.toString() +
                "bean='" + bean + '\'' +
                ", additions=" + additions +
                '}';
    }
}
