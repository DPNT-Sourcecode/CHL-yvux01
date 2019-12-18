package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {

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

        throw new SolutionNotImplementedException();
    }
}

