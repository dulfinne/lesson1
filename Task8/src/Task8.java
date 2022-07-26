import java.util.Scanner;

public class Task8
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("n = ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.print("k = ");
		int k = Integer.parseInt(scan.nextLine());
		
		int sum = 0;
		
		int[] digits = new int[n];
		for (int i = 0; i < n; i++)
		{
			digits[i] = (int) (Math.random() * 100);
			System.out.print(digits[i] + " ");
			if (digits[i] % k == 0)
				sum += digits[i];
		}
		System.out.println("\nS = " + sum);
	}
}
