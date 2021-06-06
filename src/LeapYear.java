import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int Year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any Year:");
		Year = scan.nextInt();
		scan.close();
		boolean isLeap = false;

		if (Year % 4 == 0) {
			if (Year % 100 == 0) {
				if (Year % 400 == 0) {
					isLeap = true;
				} else {
					isLeap = false;
				}
			} else {
				isLeap = true;
			}

		} else {
			isLeap = false;
		}
		if (isLeap == true)
			System.out.println(Year + " is a Leap Year.");
		else
			System.out.println(Year + " is not a Leap Year.");
	}
}
