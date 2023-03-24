package HomeWork1;
import java.util.ArrayList;
import java.util.Random;

public class User {
    protected String name;
    protected String parol;
    protected Basket userBasket;

    public User(String name, String parol) {
        this.name = name;
        this.parol = parol;
        Basket x = new Basket();
        userBasket = x;
    }

    public User() {
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", parol='" + parol + '\'' +
                '}';
    }
    public ArrayList<Product> getBasket(){
        return userBasket.getProdList();
    }
    public void buySome(Product product, Magazine mag){
        userBasket.addToBasket(product);
        mag.removeFromColl(product);
    }
}
