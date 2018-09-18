public class Palindrome 
{
    public static void main(String[] args) 
    {
        int num = 121,r = 0, remainder, a;
        a = num;
        while( num != 0 )
        {
            remainder = num % 10;
            r = r * 10 + remainder;
            num  /= 10;
        }
        
        if (a == r)
            System.out.println(a + " is a palindrome.");
        else
            System.out.println(a + " is not a palindrome.");
    }
}
