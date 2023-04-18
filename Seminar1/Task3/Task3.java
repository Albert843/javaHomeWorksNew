//                                       Task 3.
// Реализовать простой калькулятор
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        calculator();
    }
    public static void calculator(){
        double result = 0;

        System.out.print("Простой калькулятор.\nВведите первое число: ");
        Scanner iscanner1 = new Scanner(System.in);
        double firstNumber = iscanner1.nextInt(); 

        System.out.print("Введите знак: ");
        Scanner iscanner2 = new Scanner(System.in);
        String sign = iscanner2.nextLine();

        System.out.print("Введите второе число: ");
        // Scanner scanner3 = new Scanner(System.in);
        double secondNumber = iscanner1.nextInt(); 

        iscanner1.close();
        iscanner2.close();

        switch (sign) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Ошибка!!! Введите корректный знак");
                break;
        }
        System.out.printf("Результат:  %.2f", result);
    }
}
