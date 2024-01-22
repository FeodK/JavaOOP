package Sem6.ISP;

public class Cube implements IShape3D{
    private int lenght;

    public Cube(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public double area() {
        return lenght * lenght * 6;
    }

    @Override
    public double volume() {
        return lenght * lenght * lenght;
    }
}
