package basics;

//public class Return {

//	public static void main(String[] args) {
//		System.out.println(areaOfCircle(4));
//	}
//	public static float areaOfCircle(int radius) {
//		float area_c;
//		area_c=(3.142f)*radius*radius;
//		return area_c;
//		
//	}
//
//}

	public class Return {
		public static void main(String args[]) {
			System.out.println(validate("john123",123));
		}
		public static boolean validate(String username, int pwd) {
			if(username=="john123" && pwd==123) {
				return true;
			}
			else {
				return false;
			}
		}
	}