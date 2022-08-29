import java.util.Scanner;
public class arearectangle
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length and breadth:");
		float L=sc.nextFloat();
		float B=sc.nextFloat();
		double A=L*B;
		System.out.println("Area of rectangle: "+A);
		
	}
}