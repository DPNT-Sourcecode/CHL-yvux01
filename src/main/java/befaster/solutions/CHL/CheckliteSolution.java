package befaster.solutions.CHL;

import befaster.solutions.CHL.discounters.DiscounterFacade;
import com.google.common.collect.ImmutableSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;

public class CheckliteSolution {

    public static final Set<Character> validSkus = ImmutableSet.of('A', 'B', 'C', 'D', 'E');

    private final DiscounterFacade discounter;

    public CheckliteSolution() {
        this.discounter = new DiscounterFacade();
    }

    public Integer checklite(String skus) {
        if (skus == null) {
            return -1;
        }

        char[] chars = skus.toCharArray();

        if (!isValidSkus(chars)) {
            return -1;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : chars) {
            charCount.compute(c, (k, v) -> v == null ? 1 : ++v);
        }

        for(char c : validSkus) {
            charCount.putIfAbsent(c, 0);
        }

        Integer eCount = computeCount('E', charCount, this::calculateETotal);
        Integer dCount = computeCount('D', charCount, this::calculateDTotal);
        Integer cCount = computeCount('C', charCount, this::calculateCTotal);
        Integer bCount = computeCount('B', charCount, this::calculateBTotal);
        Integer aCount = computeCount('A', charCount, this::calculateATotal);

        return dCount + cCount + bCount + aCount + eCount;
    }

    private Integer computeCount(char d, Map<Character, Integer> charCount, UnaryOperator<Integer> op) {
        return charCount.computeIfPresent(d, (k, v) -> op.apply(v));
    }

    private boolean isValidSkus(char[] chars) {
        for (char c : chars) {
            if (!validSkus.contains(c)) {
                return false;
            }
        }

        return true;
    }

    private int calculateDTotal(Integer v) {
        return v * 15;
    }

    private int calculateCTotal(Integer v) {
        return v * 20;
    }

    private Integer calculateBTotal(Integer v) {
        return (v / 2 * 45) + (v % 2 * 30);
    }

    private Integer calculateATotal(Integer v) {
        int total = v * 50;
        return total - discounter.getDiscount('A', total, v);
    }

    private Integer calculateETotal(Integer v) {
        return v * 40;
    }
}


