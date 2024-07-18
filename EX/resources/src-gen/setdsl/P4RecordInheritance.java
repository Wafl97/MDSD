package setdsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import utils.*;

public class P4RecordInheritance extends AbstractRecordProgram{

	public List compute() {
		List results = new ArrayList();
		results.add(new r2(Set.of(1,2,4)).x);
		return results;
	}
	
	public class r1 {
		private Set a;
		public Set b;
		public Set union;
		public Set intersection;
		
		public r1(Set a) {
			this.a = a;
			this.b = Set.of(1,2,3);
			this.union = set_union(this.a, this.b);
			this.intersection = set_intersection(this.a, this.b);
		}
	}
	
	public class r2 extends r1 {
		public Set x;
		
		public r2(Set a) {
			super(a);
			this.x = set_product(Set.of(2,4,6), this.intersection);
		}
	}
}
