import java.util.Scanner;
public class table{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n\t\"Determine the Multiplication Table\"");
		Scanner input = new Scanner(System.in);
		int n ;

		
		System.out.print("\nEnter the number : ");
		n = input.nextInt();

		System.out.println("\nThe Multiplication Table of " + n + " is : " );
		System.out.println();

		for(int i = 1; i <= 10; i++)
		{
			
			System.out.println(n + " X " + i + " = " + n * i);		

		}



		







	}

}