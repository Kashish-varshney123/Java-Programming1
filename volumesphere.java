import java.util.Scanner;
public class volumesphere
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of sphere:");
		float R = sc.nextFloat();
		double A = (4/3)*3.14*R*R*R;
		System.out.println("Volume of sphere: "+A);
	}
}
		