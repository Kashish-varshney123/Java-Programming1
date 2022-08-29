import java.util.Scanner;
public class areaparallelogram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height of the parallelogram:");
		float b = sc.nextFloat();
		float h = sc.nextFloat();
		double A = b*h;
		System.out.println("Area of parallelogram: "+A);
	}
}