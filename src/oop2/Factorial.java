package oop2;

public class Factorial {
	
	void fact(int x) {
		int fact = 1;
		for(int i = 1; i<=x; i = i+1)
			fact = fact*i;
		System.out.println(fact);
		
	}
	
	void swipe(int x, int y) {
		// x
		// y
		//int temp;
		
		//temp=x;
		//x=y;
		//y=temp;
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println(x+"  "+y);

		}
	
	 
	public static void main(String[] args) {
		
		Factorial f1 = new Factorial();
		f1.fact(3);
		f1.fact(4);
		f1.fact(5);
		f1.swipe(2, 3);
		f1.swipe(5, 6);
		f1.swipe(12, 15);
		

	}

}
