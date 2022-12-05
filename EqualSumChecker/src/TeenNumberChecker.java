public class TeenNumberChecker {
    public static boolean hasTeen (int num1, int num2, int num3) {
        if((num1 < 20 && num1>12 ) || (num2 < 20 && num2>12) || (num3 < 20 && num3>12)){
            return true;
        }
        return false;
    }
}
