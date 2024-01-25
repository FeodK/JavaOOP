package Sem7.fabricMethod;

public class GemGen implements IItemGen{

    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
    
}
