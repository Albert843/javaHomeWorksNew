//                                       Task 2.
// Вывести все простые числа от 1 до 1000
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = iScanner.nextInt();
        iScanner.close();
        SimpleNumbers(num);
        for (int i = 0; i < num; i++) {
            if(SimpleNumbers(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean SimpleNumbers(int num){
        if(num == 0 || num == 1) return false;
        for (int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}