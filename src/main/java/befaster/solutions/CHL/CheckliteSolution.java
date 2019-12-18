package befaster.solutions.CHL;

import befaster.runner.SolutionNotImplementedException;
import com.google.common.collect.ImmutableSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckliteSolution {

    public static final Set<Character> validSkus = ImmutableSet.of('A', 'B', 'C', 'D');

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

        Integer dCount = charCount.compute('D', (k, v) -> v == null ? 0 : calculateDTotal(v));
        Integer cCount = charCount.compute('C', (k, v) -> v == null ? 0 : calculateCTotal(v));
        Integer bCount = charCount.compute('B', (k, v) -> v == null ? 0 : calculateBTotal(v));
        Integer aCount = charCount.compute('A', (k, v) -> v == null ? 0 : calculateATotal(v));


        return dCount + cCount + bCount + aCount;
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
        return (v / 3 * 130) + (v % 3 * 50);
    }
}
