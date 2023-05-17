package basics;

//Java program to read data of various types using Scanner class.
import java.util.Scanner;

//public class ScannerDemo1 {
//	public static void main(String[] args) {
//		// Declare the object and initialize with
//		// predefined standard input object
//		Scanner sc = new Scanner(System.in);
//
//		// String input
//		String name = sc.nextLine();
//
//		// Character input
//		char gender = sc.next().charAt(0);
//
//		// Numerical data input
//		// byte, short and float can be read
//		// using similar-named functions.
//		int age = sc.nextInt();
//		long mobileNo = sc.nextLong();
//		double cgpa = sc.nextDouble();
//
//		// Print the values to check if the input was correctly obtained.
//		System.out.println("Name: " + name);
//		System.out.println("Gender: " + gender);
//		System.out.println("Age: " + age);
//		System.out.println("Mobile Number: " + mobileNo);
//		System.out.println("CGPA: " + cgpa);
//	}
//}


public class ScannerDemo1{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long mobile = sc.nextLong();
		double per = sc.nextDouble(); 
		
		System.out.println("Enter the Name "+name);
		System.out.println("Enter the gender "+gender);
		System.out.println("Enter the Age "+age);
		System.out.println("Enter the Mobile Number "+mobile);
		System.out.println("Enter the Percentage "+per);
		
	}
}
































