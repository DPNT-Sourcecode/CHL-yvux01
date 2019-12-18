package befaster.solutions.CHL.discounters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DiscounterFacade {

    Map<Character, Set<Discounter>> discounters = new HashMap<>();

    public DiscounterFacade() {
        addDiscounter('A', new ASkuDiscounter());
    }

    private void addDiscounter(char c, Discounter discounter) {
        discounters.putIfAbsent(c, new HashSet<>());
        discounters.computeIfPresent(c, (k, v) -> {
            v.add(discounter);
            return v;
        });
    }

    public int getDiscount(char c, int value, int noOfitems) {
        return discounters.get(c).stream()
                .map(d -> d.getDiscount(value, noOfitems))
                .reduce((d1, d2) -> d1 + d2)
                .orElse(0);
    }
}
