package Sem7.decorator;

public class PeperoniDecorator extends PizzaDecorator{

    public PeperoniDecorator(Pizza pizza) {
        super(pizza);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Peperoni";
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return pizza.getCost() + 35;
    }
    
}
