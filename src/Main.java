import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        if (num1 == num2 && num1 == num3 && num2 == num3)
            System.out.println("Все числа одинаковы: " + num1 + " " + num2 + " " + num3);
        else if (num1 == num2 || num1 == num3 || num2 == num3) {
            if (num1 == num2) {
                System.out.println("Пара одинаковых чисел: " + num1 + " и " + num2);
            }
            if ((num1 == num3)) {
                System.out.println("Пара одинаковых чисел: " + num1 + " и " + num3);
            }
            if (num2 == num3) {
                System.out.println("Пара одинаковых чисел: " + num2 + " и " + num3);
            }
        } else {
            System.out.println("Все числа разные");
        }
    }
}