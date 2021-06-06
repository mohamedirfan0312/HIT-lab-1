import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		char opr;
		int no1, no2, result;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
		opr = input.next().charAt(0);

		System.out.println("Enter first number");
		no1 = input.nextInt();
		System.out.println("Enter second number");
		no2 = input.nextInt();
		switch (opr) {

		case '+':
			result = no1 + no2;
			System.out.println(no1 + " + " + no2 + " = " + result);
			break;

		case '-':
			result = no1 - no2;
			System.out.println(no1 + " - " + no2 + " = " + result);
			break;

		case '*':
			result = no1 * no2;
			System.out.println(no1 + " * " + no2 + " = " + result);
			break;

		case '/':
			result = no1 / no2;
			System.out.println(no1 + " / " + no2 + " = " + result);
			break;
		default:
			System.out.println("Invalid operator!");
			break;
		}
		input.close();
	}
}
