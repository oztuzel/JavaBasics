import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while(true) {
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();

                if(first){
                    first = false;
                    min= number;
                    max= number;
                }

                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            }else{
                System.out.println("Invalid value");
                break;
            }
            scanner.nextLine();
        }


        scanner.close();

    }
// Burdan sonraki olusturulan fonksiyon baska bir challenge icindir.
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sum= 0;
        int counter = 0;

        while(true) {
            boolean hasNextInteger = scanner.hasNextInt();
            if(hasNextInteger){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            }else{
                System.out.println("SUM = "+ sum+ " AVG = "+ Math.round( (double) sum / counter));
                break;
            }
        }
        scanner.close();
    }
}