public class SumOddRange {
 
 public static boolean isOdd(int number){
     if(number<0)
     {
         return false;
     }
     else if(number>0 && number%2!=0) 
     {
         return true;
     }
     else
     {
         return false;
     }
 }
 
 public static int sumOdd(int start,int end){
     int oddSum=0;
     if(start>end || start<0)
     {
         return -1;
     }
     else{
     for(int i = start; i <= end; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
			}
		}
     }
		return oddSum;
 }
}
