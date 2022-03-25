package hackerrank_problems;

public class StrongPassword {

	public static void main(String args[]) {

		System.out.println(minimumNumber(7, "AUzs+1nV"));

	}

	public static int minimumNumber(int n, String password) {

//		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,100}$";
//
//		Pattern p = Pattern.compile(regex);
//
//		return p.matcher(password).matches();

		String lowerCase = ".*[a-z].*";
		String upperCase = ".*[A-Z].*";
		String oneDigit = ".*[0-9].*";
		String specialChar = ".*[-!@#$%^&*()+].*t";

		int count = 0;

		if (!password.matches(lowerCase)) {
			System.out.println("lc");
			++count;
		}
		if (!password.matches(upperCase)) {
			System.out.println("uc");
			++count;
		}
		if (!password.matches(oneDigit)) {
			System.out.println("od");
			++count;
		}
		if (!password.matches(specialChar)) {
			System.out.println("sc");
			++count;
		}

		if (count <= 6 - n && n < 6) {
			return 6 - n;
		}

		return count;

	}

}
