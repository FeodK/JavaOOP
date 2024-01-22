package Sem6.ISP;

public class Circle  implements IShape{
    private int radios;

    public Circle(int radios) {
        this.radios = radios;
    }

    @Override
    public double area() {
        return 3.14 * radios * radios;
    }

    
}
