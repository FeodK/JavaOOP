package Task2HW;

public class Main {
    public static void main(String[] args) {

        Human numan1 = new Human("Василий");
        Human numan2 = new Human("Роман");

        Market market = new Market();

        market.acceptToMarket(numan1);
        market.acceptToMarket(numan2);

        market.update();
    }
}
