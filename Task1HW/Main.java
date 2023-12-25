package Task1HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink hd1 = new HotDrink("coffee", 60, 0.15, 90.7);
        HotDrink hd2 = new HotDrink("Tea", 50, 0.23, 93.1);
        List<Product> productList = new ArrayList<>();
        productList.add(hd1);
        productList.add(hd2);
        HotDrinkVenMach vendingMachine = new HotDrinkVenMach();
        vendingMachine.initProduct(productList);
        System.out.println(vendingMachine.getProduct("Tea"));
    }
}
