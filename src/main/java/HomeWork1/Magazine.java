package HomeWork1;
import java.util.ArrayList;

public class Magazine {
    private String magazineName;
    private ArrayList<Product> prodList;

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
        this.prodList = new ArrayList<>();
    }

    public void addToColl(Product product){
        this.prodList.add(product);
    }

    public String getmagazineName() {
        return magazineName;
    }

    public void setmagazineName(String magazineName) {
        this.magazineName = magazineName;
    }
    public ArrayList<Product> getProdList() {
        return prodList;
    }
    public void removeFromColl(Product product){this.prodList.remove(product);}
}
