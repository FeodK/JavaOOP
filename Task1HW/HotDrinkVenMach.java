package Task1HW;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVenMach implements VendingMachine{
    private List<Product> productList = new ArrayList<>();

    @Override
    public void initProduct(List<Product> productlist) {
        this.productList = productlist;
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
    public Product getProduct(String name, double volume, double temp){
        for (Product product : productList) {
            if(product.getName().equals(name) && ((HotDrink) product).getVolume() == volume && ((HotDrink) product).getTemp() == temp){
                return product;
            }
        }
        return null;
    }
}
