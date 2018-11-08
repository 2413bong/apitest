package apitest;

public class Calculator {
	public  int plus(int a, int b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public double divide(int a, int b) {
		return a/b;
	}
	public static class Calculatortest{
		public static void main(String[] args) {
			Calculator cl = new Calculator();
			System.out.println(cl.plus(5,6));
			System.out.println(cl.minus(5, 3));
			System.out.println(cl.multiply(3, 5));
			System.out.println(cl.divide(6, 3));
		}
	}
}
