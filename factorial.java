public class Factorial 
{
    public static void main(String[] args)
    {
        int a = 10;
        long fact = 1;
        for(int i = 1; i <= a; ++i)
        {
            fact *= i;
        }
        System.out.printf("Factorial of %d = %d", a, fact);
    }
}
