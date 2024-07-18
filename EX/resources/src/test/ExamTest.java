package test;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import setdsl.*;
import utils.Tuple;

public class ExamTest {

	@Test
	public void p1() {
		List<Set<Object>> result = new P1Basic().compute();
		Assertions.assertTrue(result.get(0).isEmpty());
		Assertions.assertEquals(Set.of(1,2,3), result.get(1));
		Assertions.assertEquals(Set.of(Tuple.of(1,2),Tuple.of(3,4)), result.get(2));
	}
	
	@Test
	public void p2() {
		List<Set<Object>> result = new P2Operations().compute();
		Assertions.assertEquals(Set.of(2,4,6), result.get(0));
		Assertions.assertEquals(Set.of(Tuple.of(1,2),Tuple.of(1,3),Tuple.of(2,3),Tuple.of(2,1)), result.get(1));
		Assertions.assertEquals(Set.of(Tuple.of(1,4),Tuple.of(1,5),Tuple.of(2,4), Tuple.of(2,5), Tuple.of(3,4),Tuple.of(3,5)), result.get(2));
		Assertions.assertEquals(Set.of(Tuple.of(1,2),Tuple.of(1,3),Tuple.of(2,3)), result.get(3));
		Assertions.assertEquals(Set.of(Tuple.of(1,3), Tuple.of(4,6), Tuple.of(7,9)), result.get(4));
		Assertions.assertEquals(Set.of(1,3), result.get(5));
	}
	
	@Test
	public void p3() {
		List<Set<Object>> result = new P3Records().compute();
		Assertions.assertEquals(Set.of(1,2,3), result.get(0));
		Assertions.assertEquals(Set.of(1,2), result.get(1));		
	}
	
	@Test
	public void p4() {
		List<Set<Object>> result = new P4RecordInheritance().compute();
		Assertions.assertEquals(Set.of(Tuple.of(2,1), Tuple.of(2,2), Tuple.of(4,1), Tuple.of(4,2), Tuple.of(6,1), Tuple.of(6,2)), result.get(0));
	}
	
	@Test
	public void p5() {
		List<Set<Object>> result = new P5ExternalFunctions(new ExternalImpl()).compute();
		Assertions.assertEquals(Set.of(2,4,6,8), result.get(0));
		Assertions.assertEquals(Set.of(Tuple.of(1,2),Tuple.of(2,3)), result.get(1));
	}
	
	@Test
	public void p6() {
		List<Set<Object>> result = new P6CompleteProgram(new ExternalImpl()).compute();
		Assertions.assertEquals(Set.of(2,4), result.get(0));
		Assertions.assertEquals(Set.of(1,2,3,4), result.get(1));
		Assertions.assertEquals(Set.of(2), result.get(2));
		Assertions.assertEquals(Set.of(Tuple.of(1,2),Tuple.of(2,2), Tuple.of(3,2), Tuple.of(4,2)), result.get(3));
		Assertions.assertEquals(Set.of(Tuple.of(1,2), Tuple.of(4,5), Tuple.of(7,8)), result.get(4));
		Assertions.assertEquals(Set.of(Tuple.of(2,1), Tuple.of(6,3)), result.get(5));
	}
	
}
