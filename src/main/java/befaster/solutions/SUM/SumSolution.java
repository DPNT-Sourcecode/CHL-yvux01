package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;
import com.google.common.base.Preconditions;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
        Preconditions.checkArgument(x >= 0, "%s must be non-negative", x);
        Preconditions.checkArgument(y >= 0, "%s must be non-negative", y);
        return x + y;
    }

}


