//                                              Task 2.
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.log(Level.INFO,"Bubble sort array");

        int[] array = GetArray();
        PrintArray(array);
        BubbleSort(array);
        PrintArray(array);
    }
    public static int[] GetArray(){
        Random rand = new Random(10);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }
    public static int[] BubbleSort(int [] array){
        for(int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i-1; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }   
        }
        return array;
    }  
    public static void PrintArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    } 
}