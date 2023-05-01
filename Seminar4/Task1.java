//                                     Task1
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        ReverseList();
    }
    public static void ReverseList(){
        LinkedList<String> list = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println(list.toString());
            System.out.print("Для окончания и 'переворачивания списка', нажмите 's'.\nдля продолжения введите строку: ");
            String word = iScanner.nextLine().toLowerCase();
            if(word.equals("s")){
                Collections.reverse(list);
                flag = false;
            }
            else list.add(word);
            System.out.println(list);
        }
        iScanner.close();
    }
}