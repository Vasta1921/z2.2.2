package web.Model;

public class Car {
    public String model;
    private int year;
    private double price;

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public double getPrice() {
        return price;
    }

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
}
