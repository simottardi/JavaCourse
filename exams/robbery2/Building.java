package exams.robbery2;

public class Building {

    public String name;
    public Item[] items;

    public Building(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public Item[] getItems() {
        return items;
    }
}
