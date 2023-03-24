package HomeWork1;

public class Product {
    private String name;
    private int price;
    private int reit;

    public Product(String name, int price, int reit) {
        this.name = name;
        this.price = price;
        this.reit = reit;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", reit=" + reit +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReit() {
        return reit;
    }

    public void setReit(int reit) {
        this.reit = reit;
    }
}
