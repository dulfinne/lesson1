import java.util.Scanner;

public class Task3
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a and b sides: ");
		double a = Double.parseDouble(scan.nextLine());
		double b = Double.parseDouble(scan.nextLine());
		double c = Math.sqrt(a*a + b*b);
		System.out.println("P = " + (a + b + c) + "; S = " + (a + b)/2 + ";");
	}
}
