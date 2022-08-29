import java.util.Scanner;
public class areatriangle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height and base of the triangle:");
		float h = sc.nextFloat();
		float b = sc.nextFloat();
		double A = 0.5*b*h;
		System.out.println("Area of triangle: "+A);
	}
}