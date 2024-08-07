/* generated by SetLang parser */

package setdsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import utils.*;

public class P2Operations extends AbstractRecordProgram {
	
	public List compute() {
		List results = new ArrayList();
		results.add(set_intersection(set_union(Set.of(1, 2, 3), Set.of(4, 5, 6)), Set.of(0, 2, 4, 6, 8)));
		results.add(set_union(Set.of(Tuple.of(1, 2), Tuple.of(1, 3), Tuple.of(2, 3)), Set.of(Tuple.of(2, 1), Tuple.of(1, 3), Tuple.of(2, 3))));
		results.add(set_product(Set.of(1, 2, 3), Set.of(4, 5)));
		results.add(set_union(Set.of(Tuple.of(1, 2), Tuple.of(1, 3)), set_intersection(Set.of(Tuple.of(1, 3), Tuple.of(2, 3)), set_product(Set.of(1, 2, 3), Set.of(3, 4)))));
		results.add(set_projection(Set.of(Tuple.of(1, 2, 3), Tuple.of(4, 5, 6), Tuple.of(7, 8, 9)), 1, 3));
		results.add(set_projection(Set.of(Tuple.of(1, 2), Tuple.of(3, 4)), 1));
		return results;
	}
}
