
public class amstrongno
{ 

		public static void main(String[] args)
		{

			int number = 481, originalNumber, remainder, result = 0;
			originalNumber = number;
			while (originalNumber != 0)
			{
				remainder = originalNumber % 10; result += Math.pow(remainder, 3);
				originalNumber /= 10;
			}
			if(result == number)
				System.out.println(number + "\t is an Armstrong number.");
			else
				System.out.println(number + "\t is not an Armstrong number.");
		}
}
