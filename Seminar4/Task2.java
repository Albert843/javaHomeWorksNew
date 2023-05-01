//                                     Task2
// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // System.out.println("Для окончания ввода строк, нажмите 's'.\nдля продолжения введите строку: ");     // 's' - выход из программы
        LinkedList<String> list = new LinkedList<>();
        Scanner iScanner = new Scanner(System.in);
        String word = null;
        boolean flag = true;
        while(flag){
            System.out.println(list.toString());
            System.out.print("Для окончания ввода строк и получения результата, нажмите 's'.\nдля продолжения введите строку: ");
            word = iScanner.nextLine().toLowerCase();
            if(word.equals("s")){
                flag = false;
            }
            else list.add(word);
            System.out.println(list);
        }
        Enqueque(list, word);                                               // метод 1
        System.out.println(Dequeue(list, word));                            // метод 2
        System.out.println(First(list, word));                              // метод 3
    }
    public static void Enqueque(LinkedList<String> list, String word){      // метод 1
        list.addLast(word);
    }
    public static String Dequeue(LinkedList<String> list, String word){     // метод 2
        list.get(0);
        String num = list.remove(0);
        return num;
    }
    public static String First(LinkedList<String> list, String word){       // метод 3
        String num = list.get(0);
        return num;
    } 
}