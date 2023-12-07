package oop4;

public class Mychildclass extends Myabstractclass {

	public static void main(String[] args) {
		Mychildclass m1 = new Mychildclass();
		m1.add(3, 4);

	}

	@Override
	void add(int x, int y) {
		int sum = x+y;
		System.out.println(sum);
		
		}

}
