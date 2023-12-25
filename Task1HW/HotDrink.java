package Task1HW;

public class HotDrink extends Product{

    private double volume;
    private double temp;

    public HotDrink(String name, int cost, double volume, double temp) {
        super(name, cost);
        this.volume = volume;
        this.temp = temp;
    }

    public double getVolume() {
        return volume;
    }
    
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getTemp() {
        return temp;
    }
    
    public void setTemp(double temp) {
        this.temp = temp;
    }
    
    @Override
    public String toString() {
        return "HotDrink{" + "name='" + super.getName() + '\'' + ", cost=" + super.getCost() +  ", volume=" + volume + ", temp=" + temp +'}'; 
    }
}
