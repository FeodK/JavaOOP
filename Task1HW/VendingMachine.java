package Task1HW;

import java.util.List;

public interface VendingMachine {
    public void initProduct(List<Product> productlist);
    public Product getProduct(String name);
}
