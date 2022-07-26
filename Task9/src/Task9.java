import java.util.Scanner;

public class Task9
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("k = ");
		int k = Integer.parseInt(scan.nextLine());
		
		int[] a = new int[7];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = (int) (Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
        int[] b = new int[3];
        for (int i = 0; i < b.length; i++)
        {
			b[i] = (int) (Math.random() * 100);
			System.out.print(b[i] + " ");
        }
                
        int[] result = new int[10];
        for(int i = 0, j = 0; i < 10; i ++)
        {
        	if(i < k)
        		result[i] = a[i];
        	else if (i > k && j < b.length)
        	{
        		result[i] = b[j]; 
        		j++;
        	}	
        	else
        		result[i] = a[i - j];
        }
        
		System.out.println();
        
        for(int el : result)
        	System.out.print(el + " ");
	}
}
