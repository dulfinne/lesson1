import java.util.Scanner;

public class Task1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¬ведите 4хзначное число: ");
		int number = Integer.parseInt(scan.nextLine());
		
		int firstPart = number / 1000 + (number / 100) % 10;
		int secondPart = (number / 10) % 10 + number % 10;
		System.out.println(firstPart == secondPart);
	}
}
