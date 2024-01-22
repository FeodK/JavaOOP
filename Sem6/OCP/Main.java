package Sem6.OCP;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(300, "Train");
        printMaxSpeed(vehicle);
        vehicle = new Car(220);
        printMaxSpeed(vehicle);
        vehicle = new Bus(100);
        printMaxSpeed(vehicle);
    }
    public static void printMaxSpeed(Vehicle vehicle) {
        System.out.println(vehicle.calculateMaxSpeed() + " - " + vehicle.getType());
    }
}
