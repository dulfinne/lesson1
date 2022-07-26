
public class Task2
{
	public static void main(String[] args)
	{
		double a = 3.0;
		double b = 9.0;
		double c = 1.4;
		
		double result = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println(result);
	}
}
