public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;

        int intFirstNumber = (int) firstNumber;
        int intSecondNumber = (int) secondNumber;
        if (intFirstNumber == intSecondNumber){
            return true;
        }else {
            return false;
        }
    }
}
