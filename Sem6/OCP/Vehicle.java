package Sem6.OCP;

public class Vehicle {
    protected int maxSpeed;
    private String type;


    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }


    public String getType() {
        return this.type;
    }


    public double calculateMaxSpeed(){
        return maxSpeed;
    }
}
