package Task2;

public class Main {
    public static void main(String[] args) {
        Human numan1 = new Human("Рустам");
        Human numan2 = new Human("Фоат");
        Human numan3 = new Human("Александр");
        Human numan4 = new Human("Виктория");
        Human numan5 = new Human("Виктор");
        Market market = new Market();
        market.acceptToMarket(numan1);
        market.acceptToMarket(numan2);
        market.update();
        market.acceptToMarket(numan3);
        market.acceptToMarket(numan4);
        market.acceptToMarket(numan5);
        market.update();
    }
}
