package lab_exercise;

public class Rectangle extends square {
	public static void main(String[] args) {
		float len = 7, bre = 4;
		System.out.println("RECTANGLE: ");
		area();
		System.out.println(len * bre);
		peri();
		System.out.println(2 * (len + bre));
		square s = new square();
		s.show();
	}
}

class square {
	public void show() {
		int sq_size = 4;
		System.out.println(" SQUARE: ");
		area();
		System.out.println(sq_size * sq_size);
		peri();
		System.out.println(sq_size * 2);
	}

	public static void area() {
		System.out.print("Area= ");
	}

	public static void peri() {
		System.out.print("Perimeter= ");
	}
}
