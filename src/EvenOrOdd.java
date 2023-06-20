import java.util.Scanner;
// The program for determining the parity of a number
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            System.out.println("Вы ввели: " + num1);
            if (num1 % 2 == 1) {
                System.out.println("Ваше число - Нечётное");
            } else {
                System.out.println("Ваше число - Чётное");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}