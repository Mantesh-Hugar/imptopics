package encapsulation;

//class Login {
//	private String uname;
//	private String pwd;
//
//	public void setuname(String uname) {
//		this.uname = uname;
//	}
//
//	public void setpwd(String pwd) {
//		this.pwd = pwd;
//	}
//
//	public String getuname() {
//		String reg_uname = "mantesh123@gmail.com";
//		if (uname == reg_uname) {
//			return "Valid username please enter the password";
//		} else {
//			return "Invalid username please enter the valid user name";
//		}
//	}
//
//	public String getpwd() {
//		String reg_pwd = "mantesh@123";
//		if (pwd == reg_pwd) {
//			return "Password is correct please wait for next instruction";
//		} else {
//			return "Invalid password please enter the valid password";
//		}
//	}  
//}	
//
//
//public class UserLogin {
// 
//	public static void main(String[] args) {
//
//		Login l1 = new Login();
//		l1.setuname("mantesh123@gmail.com");
//		l1.setpwd("mantesh@");
//     
//		System.out.println(l1.getuname());
//		System.out.println(l1.getpwd());
//	}
//
//}

class Login {
	private String username;
	private int pwd;

	public void setUname(String username) {
		this.username = username;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public String getUname() {
		String reg_user = "Mantesh";
		if (username == reg_user) {
			return "Valid UserName";
		} else {
			return "Invalid User";
		}
	}

	public int getPwd() {
		int reg_pwd = 1234;
		if (pwd == reg_pwd) {

			return pwd;

		}

	}

public class UserLogin{
	public static void main(String args[]) {
		Login ln = new Login();
		ln.setUname("Mantesh");
		ln.setPwd(12344);
		
		System.out.println(ln.getUname());
		System.out.println(ln.getPwd());
	}
}
}