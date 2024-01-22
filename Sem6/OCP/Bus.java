package Sem6.OCP;

public class Bus extends Vehicle{

    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
        
}
    public double calculateMaxSpeed(){
        return super.calculateMaxSpeed() * 0.5;
    }
}
