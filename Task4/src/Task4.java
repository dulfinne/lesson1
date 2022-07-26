import java.util.Scanner;

public class Task4
{
	public static boolean GetResult(double x, double y)
	{
		if (Math.abs(x) <= 2 && y >= 0 && y <= 4)
			return true;
		else if (Math.abs(x) <= 4 && y <= 0 && y >= -3)
			return true;
		else
			return false;
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		double x = Integer.parseInt(scan.nextLine());
		double y = Integer.parseInt(scan.nextLine());
		
		System.out.println(GetResult(x, y));
	}
}
