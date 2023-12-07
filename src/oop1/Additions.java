package oop1;

public class Additions {
	
	//int x;
	//int y;
	
	private void add (int x, int y) {
		
		int sum = x+y;
		System.out.println(sum);
		
		}
	
	int add (int x, int y, int z) {
		
		int sum = x+y+z;
		return sum;
	//System.out.println(sum);
		
	}
	
	void add (double x, double y) {
		double sum = x+y;
	System.out.println(sum);
		}
		
	double add (double x, double y, double z) {
		double sum = x+y+z;
		return sum;
		//System.out.println(sum);
		
		}
	
	
	
	
	
	public static void main(String[] args) {
	
		Additions s1 = new Additions();
		s1.add(2, 2);
		
		
		
		
	}

}
