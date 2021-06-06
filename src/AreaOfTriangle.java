import java.util.Scanner;
public class AreaOfTriangle
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(" width of the Triangle="); 
		double base = scanner.nextDouble();
		System.out.println(" height of the Triangle="); 
		double height = scanner.nextDouble();	     
		double area = (base * height)/2;
		System.out.println("Area of Triangle = " + area); 
	}
}