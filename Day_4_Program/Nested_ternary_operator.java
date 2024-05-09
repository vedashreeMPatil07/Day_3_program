class Nested_ternary
{
    public static void main (String [] args)
    {
        int num = 10;
        
        String result = (num == 0) ? "Zero" : (num % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("The number " + num + " is " + result);
    }
}