package Calculator;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,4));
		System.out.println(substract(2,4));
		System.out.println(multiply(2,4));
		System.out.println(divide(8,4));
	}
public static int add (int a, int b) {
	return a+b;
	}
public static int substract (int a, int b) {
	return a-b;
	}
public static int multiply (int a, int b) {
	return a*b;
	}
public static int divide (int a, int b) {
	return a/b;
	}
}

