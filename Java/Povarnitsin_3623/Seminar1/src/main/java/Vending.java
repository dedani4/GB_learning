import java.util.ArrayList;
import java.util.List;

public class Wending {

    List<Product> listProduct = new ArrayList<>();
    void addProduct (Product product){
        listProduct.add(product);

    }

    Product getProduct(String name){
        for (Product product : listProduct) {
            if(product.name.equals(name)) {
                return product;
            }
        }
        return null;
    }

}
