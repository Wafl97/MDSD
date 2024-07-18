package utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tuple implements Iterable<Object>{
	List<Object> content;
	
	public Tuple() {
		content = new ArrayList<Object>();
	}
	public Tuple(Object... data) {
		content = List.of(data);
	}
	
	public static Tuple of(Object... data) {
		return new Tuple(data);
	}
	
	public Object project(List<Integer> idx) {
		if(idx.size()==1) {
			return nth(idx.get(0));
		} else {
			Tuple result = new Tuple();
			for(Integer i: idx)
				result.content.add(nth(i));
			return result;
		}
	}
	
	public boolean isEmpty() {
		return content.isEmpty();
	}
	
	private Object nth(Integer i) {
		return content.get(i-1);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Tuple))
			return false;
		Tuple other = (Tuple) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else {
			if(content.size() != other.content.size())
				return false;
			for(int i = 0; i<content.size(); i++) {
				if (content.get(i) != other.content.get(i))
						return false;
			}
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return content.toString();
	}
	@Override
	public Iterator<Object> iterator() {
		return content.iterator();
	}
}
