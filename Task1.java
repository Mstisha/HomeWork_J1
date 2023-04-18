import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int summ = 0;
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
 
        for (int i = 1 ; i <= number; i++) {
            summ += i;
        }
 
        System.out.println(summ);
    }
}
