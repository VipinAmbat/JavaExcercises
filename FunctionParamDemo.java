// Program to display how function works in Java with parameters

//import java.util.Scanner;
public class FunctionParamDemo
{
	public static int summation(int a, int b, int c)
	{
		System.out.println("Execute the parameters!");
		int d;
		d=a+b+c;
		return d;
	}
		
	
	public static void main(String[] ar)
	{
		int f;
		f=summation(90,85,100);
		System.out.println("Value of SUmmation is !\t" +f);
		System.out.println("\nFunction with parameter has got executed!");
		
	}
	
}