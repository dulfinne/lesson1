import java.util.Scanner;

public class Task7
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print("b = ");
		int b = Integer.parseInt(scan.nextLine());
		System.out.print("h = ");
		int h = Integer.parseInt(scan.nextLine());
		
		System.out.println("|\tx\t|\t    y\t\t|");
		for (int x = a; x <= b; x += h)
		{
			double y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
			System.out.printf("|\t%2d\t|\t%5f\t|\n", x, y); 
		}
	}
}
