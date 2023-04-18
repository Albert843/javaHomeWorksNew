//                                       Task 1.
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = iScanner.nextInt();
        iScanner.close();
        System.out.println("Треугольное число = " + TriangleNumber(num));
        System.out.println("Факториал = " + Factorial(num));
        
    }
    public static int TriangleNumber(int num){
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = (num*(num+1))/2;
        }
        return sum;
    }
    public static int Factorial(int num){
        if(num == 0 || num == 1) return 1;
        int result = num*Factorial(num - 1);
        return result;
    }  
}





