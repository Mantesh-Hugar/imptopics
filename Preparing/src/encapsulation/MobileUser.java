package encapsulation;

//class Mobile {

//	private String mobile1;
//	private String mobile2;
//
//	public void setmobile1(String mobile1) {
//		this.mobile1 = mobile1;
//	}
//
//	public void setmobile2(String mobile2) {
//		this.mobile2 = mobile2;
//	}
//
//	public String getmobile1() {
//		String reg_mobile1 = "SDE@123";
//		if (mobile1 == reg_mobile1) {
//			return "Valid password";
//		} else {
//			return "Invalid pasword";
//		}
//	}
//
//	public String getmobile2() {	
//		String reg_mobile2 = "Adu123@";
//		if (mobile2 == reg_mobile2) {
//			return "Valid password";
//		} else {
//			return "Invalid password";
//		}
//	}
//}
//
//public class MobileUser {
//
//	public static void main(String[] args) {
//
//		Mobile m1 = new Mobile();
//		m1.setmobile1("SDE@123");
//		m1.setmobile2("Adu123@");
//		System.out.println(m1.getmobile1());
//		System.out.println(m1.getmobile2());
//	}
//
//}

class Mobile {
	private String mobile1;
	private String mobile2;

	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public String getMobile1() {
		String reg_mobile1 = "Mantesh";
		if (mobile1 == reg_mobile1) {
			return "Valid Password";
		} else {
			return "Please enter valid password";
		}
	}

	public String getMobile2() {
		String reg_mobile2 = "Hugar!233";
		if (mobile2 == reg_mobile2) {
			return "Valid Password";
		} else {
			return "Invalid Password";
		}
	}
}
	public class MobileUser {
		public static void main(String args[]) {
			
			Mobile mb = new Mobile();
			
			mb.setMobile1("Mantesh");
			mb.setMobile2("Hugar@123");

			System.out.println(mb.getMobile1());
			System.out.println(mb.getMobile2());
		}
	}

