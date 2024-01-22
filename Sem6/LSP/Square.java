package Sem6.LSP;

public class Square extends Quadrangle{
    private int lenght;


    public Square(int lenght) {
        this.lenght = lenght;
    }


    @Override
    public double area() {
        return lenght * lenght;
    }
}
