package designPatterns.solid.s;

public class Marker {
    private String name;
    private String color;
    private int manufactureYear;
    private int price;

    public Marker() {
    }

    public Marker(String name, String color, int manufactureYear, int price) {
        this.name = name;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
