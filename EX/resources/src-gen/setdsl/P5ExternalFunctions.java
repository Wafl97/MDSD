package setdsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import utils.*;

public class P5ExternalFunctions extends AbstractRecordProgram{
	private External external;

	public P5ExternalFunctions(External external) {
		this.external = external;
	}

	public List compute() {
		List results = new ArrayList();
		results.add(set_filter(Set.of(1,2,3,4,5,6,7,8,9), external::isEven));
		results.add(set_filter(Set.of(Tuple.of(1,2),Tuple.of(2,3),Tuple.of(5,7)), external::areSequential));
		return results;
	}
	
	public interface External {
		public boolean isEven(int a);
		public boolean areSequential(Tuple a);
	}
}
