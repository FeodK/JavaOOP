package Task2;

public class Human extends Actor{
    public Human(String name){
        super(name);
    }
    String getName(){
        return name;
    }
    public void setMakeOrder(boolean make){
        isMakeOrder = make;
    }
    public void setTakeOrder(boolean take){
        isTakeOrder = take;
    }
    public boolean isMakeOrder(){
        return isMakeOrder;
    }
    public boolean isTakeOrder(){
        return isTakeOrder;
    }
}
