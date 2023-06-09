
import java.util.Scanner;


public class Fibo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int a = 0;
		int b= 0;
		int c=1;
		int i = 1;
		
		while(i<=n)
		{
			a=b;
			b= c;
			c= a+b;
			System.out.println(a+" ");
			i++;
		}
		
		
		sc.close();
	}
}


/*
 * 
 * USING FOR LOOP
public static void main(String[] args) 
{
    int n, a = 0, b = 0, c = 1;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter value of n:");
    n = s.nextInt();
    System.out.print("Fibonacci Series:");
    for(int i = 1; i <= n; i++)
    {
        a = b;
        b = c;
        c = a + b;
        System.out.print(a+" ");
    }
}
*/
