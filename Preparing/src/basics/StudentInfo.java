package basics;

public class StudentInfo {

	public static void std_details(String name,long contact,String email,int yop,String address) {
		System.out.println("Student name :"+name);
		System.out.println("Contact Number :"+contact);
		System.out.println("Email id :"+email);
		System.out.println("Year of Passed out :"+yop);
		System.out.println("Adress of the student :"+address);
		System.out.println("----#####******-----");
	}
	public static void main(String[] args) {
	std_details("Mantesh", 9876543210l, "mantesh123@gmail.com", 2019, "Bhalki");
	std_details("Jagadish",8765432190l, "jagadish123@gmail.com",2020, "Bidar");
	std_details("Adarsh", 7654321890l, "adarsh123@gmail.com", 2021, "Kalburgi");
	std_details("Vishal", 6543217890l, "vishal123@gmail.com", 2022, "Bangaluru");
	std_details("Prashanth", 9988776600l, "prashanth123@gmail.com", 2023, "Mysore");
	}

}
