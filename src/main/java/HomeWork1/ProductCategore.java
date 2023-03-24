package HomeWork1;
import java.util.ArrayList;

public class ProductCategore {
    private String categoriName;
    private ArrayList<Product> prodList;

    public ProductCategore(String categoriName, ArrayList<Product> productList) {
        this.categoriName = categoriName;
        this.prodList = productList;
    }

    public ProductCategore(String categoriName) {
        this.categoriName = categoriName;
        this.prodList = new ArrayList<>();
    }

    public void addToColl(Product product){
        this.prodList.add(product);
    }

    public String getCategoriName() {
        return categoriName;
    }

    public void setCategoriName(String categoriName) {
        this.categoriName = categoriName;
    }
    public ArrayList<Product> getProdList() {
        return prodList;
    }
}
