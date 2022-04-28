import java.util.Scanner;

public class PrimeNumberUsingWhile
{

    public static void main(String[] args)
    {
        int a;
        int b = 2;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        while (b<a)
        {
            if(a%b!=0)
            {
                b = b+1;

            }
           else
            {
                System.out.println("No is not a prime");
            }





        }
        System.out.println("No is prime");




    }

}


