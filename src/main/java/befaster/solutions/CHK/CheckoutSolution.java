package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;
import com.google.common.collect.ImmutableSet;

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

        if (!isValidSkus(skus)) {
            return -1;
        }

        throw new SolutionNotImplementedException();
    }

    private boolean isValidSkus(String skus) {
        for (char c : skus.toCharArray()) {
            if (!validSkus.contains(c)) {
                return false;
            }
        }

        return true;
    }
}



