package seminars.lesson1;

public interface VendingMachine {

    void addProductList(Product product);

    Product getProductByName(String name);

    Product getProductByCost(double cost);
}
