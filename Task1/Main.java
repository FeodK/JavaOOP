package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BottleOfWater bottleOfWater = new BottleOfWater("test", 123, 1.5);
        BottleOfWater bottleOfWater1 = new BottleOfWater("test1", 423, 2.5);
        BottleOfWater bottleOfWater2 = new BottleOfWater("test2", 323, 1.0);
        BottleOfWater bottleOfWater3 = new BottleOfWater("test3", 233, 0.5);
        List<Product> productList = new ArrayList<>();
        productList.add(bottleOfWater);
        productList.add(bottleOfWater1);
        productList.add(bottleOfWater2);
        productList.add(bottleOfWater3);
        BottleOfWatterVenMach vendingMachine = new BottleOfWatterVenMach();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("test1"));
    }
}
