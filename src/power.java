public class power
{

	public static void main(String[] args)
	{
	

		int base = 9, exponent = 4;
		long result = 1;
		while (exponent != 0)
		{
			result = result * base; 
			--exponent;
		}
		System.out.println("Answer = " + result);
	}
}
		 

