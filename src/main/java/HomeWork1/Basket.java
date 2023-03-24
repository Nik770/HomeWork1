package HomeWork1;
import java.util.ArrayList;
import java.util.Random;

public class Basket extends User {

        private int basketid;
        private ArrayList<Product> prodList;
        Random r = new Random();
        int id = r.nextInt(1,150);
        public Basket() {
            basketid = id;
            this.prodList = new ArrayList<>();
        }

        public void addToBasket(Product product){
            this.prodList.add(product);
        }

        public ArrayList<Product> getProdList() {
            return prodList;
        }

        public String getBasketid() {
            return "Your basket id " + basketid;
        }
    }
