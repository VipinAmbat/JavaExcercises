import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int a,b;

        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        if (a == 1)
        {
            System.out.println("Number 1 is entered which is prime no");

        }

        else
        {

            for(b=2;b<a;b++)
            {
                if(a%b == 0)
                {
                    System.out.println("Number entered is not a prime no " +a);
                }


            }
            System.out.println("Number is prime no " +a);

        }

    }
}
