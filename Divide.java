import java.util.Scanner;

interface abc
{
    public int calc(int a,int b);
}

class pqr implements abc
{
    public int calc(int a, int b)
    {
        int c = a/b;
        return c;
    }
}

class Divide
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        pqr obj = new pqr();
        int num1,num2;

        try
        {
            System.out.println("Enter the two numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            int c = obj.calc(num1,num2);
            System.out.println("Division Result: "+c);
        }

        catch(ArithmeticException | NumberFormatException e)
        {
            System.out.println("Exception: "+e);
        }
    }
}