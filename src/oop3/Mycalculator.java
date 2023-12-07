package oop3;

public class Mycalculator implements BasicCalc {

	public static void main(String[] args) {
		
      Mycalculator c1 = new Mycalculator();
      c1.add(2, 2);
      c1.add(2.5, 4.7);
		
	}

	@Override
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		
	}

	@Override
	public void add(double a, double b) {
		double sum = a+b;
		System.out.println(sum);

	}
}