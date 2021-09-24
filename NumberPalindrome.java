public class NumberPalindrome {
    
    public static boolean isPalindrome(int number){
        int reversedInteger = 0, remainder, originalInteger;
        originalInteger = number;
        while( number != 0 )
        {
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            number  /= 10;
        }
    
        if (originalInteger == reversedInteger)
            return true;
        else
            return false;
}
}
