package Task2HW;

public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    public Actor(String name){
        this.name = name;
        isTakeOrder = false;
        isMakeOrder = false;
    }
    abstract String getName();
}
