package intermediate.thegreatrobbery;

public class Item {
    public String name;
    public double value;

    public Item(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
