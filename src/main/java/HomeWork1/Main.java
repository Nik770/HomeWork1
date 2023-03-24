package HomeWork1;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void printMassive(ArrayList<Product> arr) {

        for (Product item : arr
        ) {
            System.out.println(item.toString());
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
        Magazine Entot = new Magazine("Supermarket");
        Product Beans = new Product("UncleRodgerBeans", 250, 8);
        Entot.addToColl(Beans);
        Product Beef = new Product("OldBeaf", 85, 5);
        Entot.addToColl(Beef);
        Product Pants = new Product("ABbibas", 2500, 2);
        Entot.addToColl(Pants);
        Product Shirt = new Product("Pima", 1500, 3);
        Entot.addToColl(Shirt);
        ProductCategore Clothes = new ProductCategore("Clothes");
        Clothes.addToColl(Pants);
        Clothes.addToColl(Shirt);
        ProductCategore Goods = new ProductCategore("Goods");
        Goods.addToColl(Beef);
        Goods.addToColl(Beans);
        User Anton = new User("anton", "234");
        User David = new User("david", "134");
        User Gorg = new User("gorg", "334");
        ArrayList<Product> products = Entot.getProdList();
        printMassive(products);

        Anton.buySome(Beef, Entot);
        ArrayList<Product> Antonproducts = Anton.getBasket();
        printMassive(Antonproducts);

        David.buySome(Beans, Entot);
        ArrayList<Product> Davidproducts = David.getBasket();
        printMassive(Davidproducts);

        ArrayList<Product> products2 = Entot.getProdList();
        printMassive(products2);

    }
}

