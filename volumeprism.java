import java.util.Scanner;
public class volumeprism
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height of the cylinder");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		float B= b*b;
		double V = B*h;
		System.out.println("Volume of prism: "+V);
	}
		
}