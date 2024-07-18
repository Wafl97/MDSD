package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public abstract class AbstractRecordProgram {

		protected Set<Object> set_union(Set<Object> a, Set<Object> b) {
			Set<Object> result = new HashSet<Object>(a);
			result.addAll(b);
			return result;
		}
		
		protected Set<Object> set_intersection(Set<Object> a, Set<Object> b) {
			Set<Object> result = new HashSet<Object>(a);
			result.retainAll(b);
			return result;
		}
		
		protected Set<Object> set_product(Set<Object>  a, Set<Object> b) {
			Set<Object> result = new HashSet<Object>();
			for(Object elementA: a) {
				for(Object elementB: b) {
					result.add(Tuple.of(elementA, elementB));
				}
			}
			return result;
		}
		
		protected static Set<Object> set_projection(Set<Object> s, Integer ...idx) {
			Set<Object> result = new HashSet<Object>();
			for(Object x: s) {
				Tuple tuple = (Tuple) x;
				result.add(tuple.project(Arrays.asList(idx)));
			}
			return result;
		}
		
		protected <T> Set<Object> set_filter(Set<T> set, Predicate<T> func) {
			Set<Object> result = new HashSet<Object>();
			for(T element: set) {
				if(func.test(element))
					result.add(element);
			}
			return result;
		}
	}