package basics;

//public class MethodsWithArguement {
//
//	public static void areaOfSq(int side) {
//		int area;
//		area=side*side;
//		System.out.println("Area of Square :"+area);
//	}
//	public static void main(String args[]) {
//		areaOfSq(4);
//	}
//}

//public class MethodsWithArguement{
//	public static void main(String args[]) {
//		area(4);
//		area(5);
//		area(6);
//	}
//	public static void area(int side)
//	{
//		int area;
//		area=side*side;
//		System.out.println("Area of Square :"+area);
//	}
//}

public class MethodsWithArguement{
	public static void main(String args[]) {
		areaOfTri(2, 4);
		areaOfCir(5);
	}
	
	public static void areaOfTri(int h, int b) {
		float area_t;
		area_t=(0.5f)*h*b;
		System.out.println("Area of triangle :"+area_t);
	}
	public static void areaOfCir(int radius) {
		float area_c;
		area_c=3.542f*radius*radius;
		System.out.println("Area of Circle "+area_c);
	}
}