package setdsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import utils.*;

public class P6CompleteProgram extends AbstractRecordProgram{
	private External external;

	public P6CompleteProgram(External external) {
		this.external = external;
	}

	public List compute() {
		List results = new ArrayList();
		results.add(new r1(Set.of(2,3,4)).even);
		results.add(new r2(Set.of(2,3,4)).union);
		results.add(new r2(Set.of(2,3,4)).inter);
		results.add(new r3(Set.of(2,3,4), 1, 3).prod);
		results.add(new r4(Set.of(), Set.of(Tuple.of(1,2),Tuple.of(4,5),Tuple.of(7,8),Tuple.of(10,15),Tuple.of(5,3)), 6, Tuple.of(13,16,10)).filter);
		results.add(new r4(Set.of(), Set.of(), 6, Tuple.of(2,1)).tupleOp);
		return results;
	}
	
	public class r1 {
		private Set a;
		public Set b;
		public Set even;
		
		public r1(Set a) {
			this.a = a;
			this.b = Set.of(1,2,3);
			this.even = set_filter(this.a, external::isEven);
		}
	}
	
	public class r2 extends r1 {
		public Set union;
		public Set inter;
		
		public r2(Set a) {
			super(a);
			this.union = set_union(this.even, this.b);
			this.inter = set_intersection(this.even, this.b);
		}
	}
	
	public class r3 extends r2 {
		private int p;
		private int q;
		public Set prod;
		
		public r3(Set a, int p, int q) {
			super(a);
			this.p = p;
			this.q = q;
			this.prod = set_product(this.union, this.inter);
		}
	}
	
	public class r4 extends r2 {
		private Set s;
		private int h;
		private Tuple j;
		public Set filter;
		public Set tupleOp;
		
		public r4(Set a, Set s, int h, Tuple j) {
			super(a);
			this.s = s;
			this.h = h;
			this.j = j;
			this.filter = set_filter(this.s, external::areSequential);
			this.tupleOp = set_intersection(Set.of(this.j,Tuple.of(6,3),Tuple.of(6,4)), set_product(Set.of(2,this.h), this.b));
		}
	}
	
	public interface External {
		public boolean isEven(int a);
		public boolean areSequential(Tuple a);
	}
}
