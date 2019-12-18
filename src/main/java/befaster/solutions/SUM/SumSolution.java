package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;
import com.google.common.base.Preconditions;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
        Preconditions.checkArgument(x >= 0 && x <= 100,
                "%s must be non-negative and between 1-100", x);
        Preconditions.checkArgument(y >= 0 && y <= 100,
                "%s must be non-negative and between 1-100", y);
        return x + y;
    }

}
