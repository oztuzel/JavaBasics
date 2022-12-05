public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {

        if(firstNumber >= 0){
            firstNumber = Math.floor(firstNumber * 1000);
        }else{
            firstNumber = Math.ceil(firstNumber * 1000);
        }
        if(secondNumber >= 0){
            secondNumber = Math.floor(secondNumber * 1000);
        }else{
            secondNumber = Math.ceil(secondNumber* 1000);
        }
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        return firstNumber == secondNumber;
    }
}
