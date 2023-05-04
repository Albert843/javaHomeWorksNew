//                                                  Задача 1.
// 1) Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Дан список сотрудников:  Иван Иванов и т.д.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1{
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 123, bookPhone);
        addNumber("Ivanov", 1234, bookPhone);
        addNumber("Petrov", 987654, bookPhone);
        addNumber("Sidorov", 918273645, bookPhone);
        addNumber("Ivanov", 12345, bookPhone);
        addNumber("Petrov", 9876543, bookPhone);
        printBook(bookPhone);
    }
    // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
