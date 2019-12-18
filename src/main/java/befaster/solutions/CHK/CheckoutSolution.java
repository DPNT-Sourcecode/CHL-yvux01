package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;
import com.google.common.collect.ImmutableSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckoutSolution {

    public static final Set<Character> validSkus = ImmutableSet.of('A', 'B', 'C', 'D');

    /**
     * +------+-------+----------------+
     * | Item | Price | Special offers |
     * +------+-------+----------------+
     * | A    | 50    | 3A for 130     |
     * | B    | 30    | 2B for 45      |
     * | C    | 20    |                |
     * | D    | 15    |                |
     * +------+-------+----------------+
     *
     * @param skus
     * @return
     */

    public Integer checkout(String skus) {
        if (skus == null) {
            return -1;
        }

        char[] chars = skus.toCharArray();

        if (!isValidSkus(chars)) {
            return -1;
        }

        Arrays.sort(chars);
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c : chars) {
            charCount.compute(c, (k, v) -> v == null ? 1 : ++v);
        }

        Integer dCount = charCount.computeIfPresent('D', (k, v) -> v * 15);
        Integer cCount = charCount.computeIfPresent('C', (k, v) -> v * 20);

        return dCount;
    }

    private boolean isValidSkus(char[] chars) {
        for (char c : chars) {
            if (!validSkus.contains(c)) {
                return false;
            }
        }

        return true;
    }
}


