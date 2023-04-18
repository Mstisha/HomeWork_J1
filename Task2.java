import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 1 == 0 || number % number == 0) {
            System.out.println("Это простое число");
        }
        else{
            System.out.println("Это не простое число");
        }
            
    }
}