public interface Vending {
    void addProduct(Product product);
    Product getProduct(String name);
    Product getProduct(String name, int volume, int temperature);

}
