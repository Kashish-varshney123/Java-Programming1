import java.util.Scanner;
public class volumecylinder
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius and height of the cylinder");
		float r=sc.nextFloat();
		float h=sc.nextFloat();
		double V = 3.14*r*r*h;
		System.out.println("Volume of cylinder: "+V);
	}
		
}
		