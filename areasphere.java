import java.util.Scanner;
public class areasphere
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the sphere");
		float r=sc.nextFloat();
		double A= 4*3.14*r*r;
		System.out.println("Area of sphere: "+A);
	}
		
}