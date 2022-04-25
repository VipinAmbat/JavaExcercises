// Program to display how function works in Java

import java.util.Scanner;
public class FunctionDemo
{
	public static void summation()
	{
		int a,b,c;
		System.out.println("\nAdding two numbers");
		System.out.println("\nEnter first  number");
		Scanner input1 = new Scanner(System.in);
		a=input1.nextInt();
		System.out.println("\nEnter second  number");
		Scanner input2 = new Scanner(System.in);
		b=input2.nextInt();
		c = a+b;
		System.out.println("\nSummation of two numbers are\t " +c);
	}
		
	
	public static void main(String[] ar)
	{
		summation();
		System.out.println("\nFunction has got executed!");
		
	}
	
}