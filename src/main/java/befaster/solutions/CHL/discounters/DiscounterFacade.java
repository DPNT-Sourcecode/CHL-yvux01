package befaster.solutions.CHL.discounters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DiscounterFacade implements Discounter {

    Map<Character, Set<Discounter>> discounters = new HashMap<>();

    public DiscounterFacade() {
        addDiscounter('A', new ASkuDiscounter())
    }

    private void addDiscounter(char a, Discounter discounter) {
        discounters.putIfAbsent(a, new HashSet<>());
        discounters.computeIfPresent(a, (k, v) -> {
            v.add(discounter);
            return v;
        });
    }

    @Override
    public int getDiscount(int value, int noOfitems) {

    }
}

