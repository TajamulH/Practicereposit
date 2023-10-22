package CalcTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculator {
	
	@Test
	public void testAdd() {
		
		assertEquals(4,Calculator.add(2,2));
	}

	private static Object add(int a, int b ) {
		// TODO Auto-generated method stub
		return a+b ;
	}
	
	@Test
	public void testsubstract() {
			
			assertEquals(0,Calculator.substract(2,2));
	}
	private static Object substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b ;
	}
	@Test
	public void testmultiply() {
				
			assertEquals(8,Calculator.multiply(2,4));
	}
	private static Object multiply(int a, int b) {
			// TODO Auto-generated method stub
			return a*b ;
	}
	@Test
	public void testdivide() {
				
			assertEquals(2,Calculator.divide(8,4));
	}
	private static Object divide(int a, int b) {
			// TODO Auto-generated method stub
			return a/b ;
	}	
}
		


