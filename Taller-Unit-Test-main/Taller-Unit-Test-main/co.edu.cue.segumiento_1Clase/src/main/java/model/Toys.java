package model;

public class Toys {
    private String name;

    private double price;
    private double amount;
    private Category type;

    public Toys(String name, double price, double amount, Category type) {
        this.name = name;

        this.price = price;
        this.amount = amount;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Category getType() {
        return type;
    }

    public void setType(Category type) {
        this.type = type;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Toys{" +
                "name=" + name +
                ", price=" + price +
                ", amount=" + amount +
                ", type=" + type +
                '}';
    }
}
