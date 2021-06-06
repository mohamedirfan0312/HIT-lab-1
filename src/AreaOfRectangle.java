

import java.util.Scanner;
public class AreaOfRectangle 
{

	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Length Of A Rectangle=");
		double Length = scanner. nextDouble();
		System.out.println("Enter The Width Of A Rectangle=");
		double Width = scanner. nextDouble();
		double area= Length * Width;
		System.out.println("Area Of Rectangle="+area);

	}

}