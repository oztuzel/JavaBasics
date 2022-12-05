import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Same name variables is a bad programming practice but we did that because we are try to learning scope and visibility.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        X x = new X(scanner.nextInt());
        x.x();
        
    }

}