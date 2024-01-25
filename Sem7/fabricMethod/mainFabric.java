package Sem7.fabricMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class mainFabric {
    public static void main(String[] args) {
        List<IItemGen> gens = new ArrayList<>();
        gens.add(new GodlGen());
        gens.add(new GemGen());
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 10; i++) {
            IGameItem item = gens.get(Math.abs(rnd.nextInt() % gens.size())).createItem();
            item.open();
        }
    }
}
