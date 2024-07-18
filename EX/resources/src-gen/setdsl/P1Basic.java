package setdsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import utils.*;

public class P1Basic extends AbstractRecordProgram{

	public List compute() {
		List results = new ArrayList();
		results.add(Set.of());
		results.add(Set.of(1,2,3));
		results.add(Set.of(Tuple.of(1,2),Tuple.of(3,4)));
		return results;
	}
}
