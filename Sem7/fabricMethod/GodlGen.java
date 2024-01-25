package Sem7.fabricMethod;

public class GodlGen  implements IItemGen{

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
    
}
