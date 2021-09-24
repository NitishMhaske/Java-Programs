public class FirstLastDigitSum {
    
    public static int sumFirstAndLastDigit(int number)
    {
        int first=number,last=0;
        if(number>0){
        first=number;
        
        while(first>=10){
            first/=10;
        }
        last=number%10;
       
        }
        else if(number==0)
                return 0;
        else
            return -1;
            
         return first+last;
    }
}
