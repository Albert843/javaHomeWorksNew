import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//                                   Task 2.
// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите размер списка: ");
        Scanner iScanner = new Scanner(System.in);
        int sizeList = iScanner.nextInt();
        ArrayList<Integer> numList = new ArrayList<>();
        GetList(numList, sizeList);
        PrintArray(numList, sizeList);
        withoutEven(numList, sizeList);
    }
    public static ArrayList<Integer> GetList(ArrayList<Integer> numList, int sizeList){
        Random rand = new Random();
        for (int i = 0; i < sizeList; i++) {
            numList.add(rand.nextInt(100));
        }
        return numList;
    }
    public static void PrintArray(ArrayList<Integer> numList, int sizeList){
        for (int i = 0; i < sizeList; i++) {
            numList.get(i);
        }
        System.out.println(numList);
    }
    public static void withoutEven(ArrayList<Integer> numList, int sizeList){
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
           if( numList.get(i) % 2 != 0) resultList.add(numList.get(i));
        }
        System.out.println(resultList);
    }  
}