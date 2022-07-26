import java.util.Scanner;

public class Task6
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		int c = Integer.parseInt(scan.nextLine());
		
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a,Math.max(b, c));
		System.out.println(min + max);
	}
}
