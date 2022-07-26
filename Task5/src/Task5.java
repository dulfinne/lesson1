import java.util.Scanner;

public class Task5
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++)
		{
			double number = Double.parseDouble(scan.nextLine());
			if (number < 0)
				System.out.print(Math.pow(number, 4) + "\n");
			else
				System.out.print(Math.pow(number, 2) + "\n");
		}
	}
}
