package oop1;

public class Subtractions extends Additions {

	void sub (int x, int y) {
		int sub = x-y;
		System.out.println(sub);
		
	}
	
	void sub (int x, int y, int z) {
		int sub = x-y-z;
		System.out.println(sub);
		
	}
	
	void sub (double x, double y) {
		double sub = x-y;
		System.out.println(sub);
		
	}
	
	void sub (double x, double y, double z) {
		double sub = x-y-z;
		System.out.println(sub);
		
	}
    
    public static void main(String[] args) {
       //10+20+30-15
    	//125/5-15

       Subtractions m1 = new Subtractions();
       int ss = m1.add(10, 20, 30);
       m1.sub(ss,15 );
       double sum = m1.add(10.5, 11.4, 12.5);
       m1.sub(sum, 9.50);
       
       
      
       Divided p1 = new Divided();
       int sss = p1.div(125, 5);
       m1.sub(sss, 15);
       
		
		

	}

}
