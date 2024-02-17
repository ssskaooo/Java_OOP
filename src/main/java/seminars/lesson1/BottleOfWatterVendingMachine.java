package seminars.lesson1;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWatterVendingMachine implements VendingMachine{

    private final List<Product> productList = new ArrayList<>();

    @Override
    public void addProductList(Product product) {
        productList.add(product);

    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(double cost) {
        for (Product product : productList) {
            if(product.getCost() == cost){
                return product;
            }
        }
        return null;
    }

}
