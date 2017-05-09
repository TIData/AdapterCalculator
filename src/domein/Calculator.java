package domein;

import calcLibrary.*;

/**
 * is een adapterklasse
 */
public class Calculator implements TargetLong {

	private TargetDouble calculator;

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Calculator(long x, long y) {
            calculator = new CalculatorLibrary(x, y);
	}

	public long add() {
            return (long) calculator.add();
	}

}