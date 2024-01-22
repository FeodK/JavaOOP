package Sem6.OCP;

public class Car extends Vehicle{

    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
        
}
    public double calculateMaxSpeed(){
        return super.calculateMaxSpeed() * 0.8;
    }
}
