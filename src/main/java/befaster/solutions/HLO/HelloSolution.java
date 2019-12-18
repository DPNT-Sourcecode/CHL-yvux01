package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

public class HelloSolution {
    public String hello(String friendName) {
        String name = MoreObjects.firstNonNull(friendName, "World");
        return "Hello, " + name + "!";
    }
}
