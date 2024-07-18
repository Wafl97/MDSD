package test;

import setdsl.*;
import utils.Tuple;

public class ExternalImpl implements  P5ExternalFunctions.External,  P6CompleteProgram.External{

	@Override
	public boolean isEven(int number) {
		return number % 2 == 0;
	}

	@Override
	public boolean areSequential(Tuple a) {
		if(a.isEmpty())
			return true;
		boolean firstPass = true;
		int prev = 0;
		for(Object elem: a) {
			if(firstPass) {
				if (!(elem instanceof Integer)) //only work with integer tuples
					return false;

				firstPass = false;
				prev = (int)elem;
				continue;
			}
			int intElem = (int) elem;
			if(prev + 1 != intElem)
				return false;
			prev = intElem;
		}
		
		return true;
	}

}
