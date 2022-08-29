import java.util.Scanner;
public class areasquare
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square:");
		float s=sc.nextFloat();
		float A=s*s;
		System.out.println("Area of square: "+A);
	}
}