package oop4;

public abstract class Myabstractclass {
	
	abstract void add(int x, int y);
	 
	void add(double x , double y) {
		double sum = x+y;
		System.out.println(sum);
		
	}
	

	public static void main(String[] args) {
		
		//Myabstractclass s1 = new Myabstractclass();
		//s1.add(3.5, 9.6);
		
		

	}

}
