import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//                                 Task 3.
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите длину списка: ");
        Scanner iScanner = new Scanner(System.in);
        int sizeList = iScanner.nextInt();
        ArrayList<Integer> numList = new ArrayList<>();
        GetList(numList, sizeList);
        PrintList(numList, sizeList);
        Result(numList, sizeList);
    }
    public static ArrayList<Integer> GetList(ArrayList<Integer> numList, int sizeList){
        Random rand = new Random();
        for (int i = 0; i < sizeList; i++) {
            numList.add(rand.nextInt(10));
        }
        return numList;
    }
    public static void PrintList(ArrayList<Integer> numList, int sizeList){
        for (int i = 0; i < sizeList; i++) {
            numList.get(i);
        }
        System.out.println(numList);
    }
    public static void Result(ArrayList<Integer> numList, int sizeList){
        int min = numList.get(0);
        int max = numList.get(0);
        float sum = 0;
        for (int i = 0; i < sizeList; i++) {
            if(numList.get(i) < min) min = numList.get(i);
            if(numList.get(i) > max) max = numList.get(i);
            sum += numList.get(i);
        }
        System.out.printf("min = " + min + ",\t" + "max = " + max + ",\t" + "среднее арифметическое списка = " + "%.1f",sum/sizeList);
    }
}