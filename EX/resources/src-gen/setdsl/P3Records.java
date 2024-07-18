package setdsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import utils.*;

public class P3Records extends AbstractRecordProgram{

	public List compute() {
		List results = new ArrayList();
		results.add(new r1(1).union);
		results.add(new r1(1).intersection);
		return results;
	}
	
	public class r1 {
		private int a;
		public Set b;
		public Set union;
		public Set intersection;
		
		public r1(int a) {
			this.a = a;
			this.b = Set.of(1,2,3);
			this.union = set_union(Set.of(this.a,2), this.b);
			this.intersection = set_intersection(Set.of(this.a,2), this.b);
		}
	}
}
