package Sem6.DIP;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DiselEngine());
        car.start();
    }
}
