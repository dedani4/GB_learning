import java.util.ArrayList;
import java.util.List;

public class DrinkMachine implements Vending{

    private final List<HotDrink> drinkList;

    public DrinkMachine() {
        drinkList = new ArrayList<>();
    }


    public void addProduct(Product product) {
        drinkList.add((HotDrink) product);
    }

    public Product getProduct(String name) {
        for (Product product : drinkList) {
            if (name.equals(product.getName())){
                return product;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink drink : drinkList) {
            if (name.equals(drink.getName()) && volume==drink.getVolume() && temperature==drink.getTemperature())
                return drink;
        }
        
        return null;
    }
}
