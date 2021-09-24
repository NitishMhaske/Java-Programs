public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber,int secondNumber){
        boolean response = false;
        if((firstNumber>=10 && firstNumber <= 99) && (secondNumber>=10 && secondNumber <= 99) ){
            while(firstNumber!=0){
                int firstsDigit = firstNumber % 10;
                int secondNumberDuplicate = secondNumber;
                while(secondNumberDuplicate!=0){
                    int secondsDigit = secondNumberDuplicate % 10;
                    if(secondsDigit == firstsDigit){
                        response = true;
                    }
                    secondNumberDuplicate /= 10;
                }
                firstNumber /= 10;
            }
        }else {
            response =  false;
        }
        return response;
    }
}
