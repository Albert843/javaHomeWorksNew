import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;
import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args)throws Exception {

        Logger logger = Logger.getLogger(Task3.class.getName());
        FileHandler fh = new FileHandler("logTask4.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.log(Level.INFO, "Simple calculator");
    
        calculator();
    }
    public static void calculator(){
        LinkedList<Double> list = new LinkedList<Double>();

        boolean flag = true;
        while(flag){
            System.out.println(list.toString());

            Double result = 0.0;
            System.out.println("Простой калькулятор.\nВведите первое число: ");
            Scanner iscanner1 = new Scanner(System.in);
            double firstNumber = iscanner1.nextInt(); 

            System.out.print("Введите знак: ");
            Scanner iscanner2 = new Scanner(System.in);
            String sign = iscanner2.nextLine();
    
            System.out.print("Введите второе число: ");
            double secondNumber = iscanner1.nextInt(); 
        
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
            System.out.printf("Результат:  %.2f\n", result);

            list.add(result);
            System.out.println(list);
            
            System.out.print("Отменить последнюю операцию? Y -да, любая клавиша - нет :");
            String choice = iscanner2.nextLine().toLowerCase();
            if(choice.equals("y")){
                list.removeLast();
                flag = false;
                System.out.println(list);
            }
        }
    }
}