class main
{
    // Driver Code
    public static void main(String []args)
    {

        System.out.println(isDivisible(75));
        System.out.println(isDivisible(171));
        System.out.println(isDivisible(481));
    }

    // Function to check if the
    // given number is divisible
    // by sum of its digits
    static String isDivisible(int number)
    {
        int temp = number;

        // Find sum of digits
        int sum = 0;
        while (number != 0)
        {
            int k = (int) number % 10;
            sum += k;
            number /= 10;
        }

        // check if sum of digits divides number
        if (temp % sum == 0)
            return "TRUE";

        return "FALSE";
    }
}

