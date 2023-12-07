package oop1;

public class Divided {

	public static void main(String[] args) {
     
		Divided p1 = new Divided();
		p1.div(10, 2);
		 
		
		}
	
	protected int div(int x, int y) {
	int result = x/y;
		return result;
		//System.out.println(result);
	}

     void div(double x, double y) {
	double result = x/y;
	System.out.println(result);
	
}


  }
