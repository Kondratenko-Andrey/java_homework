//3) В калькулятор добавьте возможность отменить последнюю операцию.
//        Пример
//
//        1
//        +
//        2
//        ответ:
//        3
//
//        +
//        4
//        ответ:
//        7
//        +
//        2
//
//        ответ:
//        9
//        1
//        Ответ 8
//        Отмена -> 9
//        Отмена -> 7
//        Отмена -> 3
//        +
//        2
//        Ответ 5

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Double> number_list = new LinkedList<>();

        boolean first_input = true;
        boolean calc = true;
        double number1 = 0.0;
        String operation;

        while (calc) {
            if (first_input) {
                number1 = input_number(sc);
                first_input = false;
            }

            operation = input_operation(sc);
            while (operation.equalsIgnoreCase("отмена")) {
                if (operation.equals("отмена")) {
                    if (!number_list.isEmpty()) {
                        reset_operation(number_list);
                        number1 = number_list.getLast();
                    } else {
                        System.out.println("Текущий результат отсутствует.");
                        number1 = input_number(sc);
                    }
                    operation = input_operation(sc);
                }
            }
            double number2 = input_number(sc);
            double result = calculation(number1, number2, operation);
            number1 = result;
            add_element(number_list, result);
            System.out.println("Результат = " + result);
        }

    }


    public static double input_number(Scanner scanner) {
        System.out.println("Введите число");
        double number = 0.0;
        try {
            number = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Вы ввели не число. Попробуйте еще раз");
            scanner.nextLine();
            input_number(scanner);
        }
        return number;
    }

    // Функция ввода оператора действия
    public static String input_operation(Scanner scanner) {
        System.out.println("Введите оператор действия (+, -, *, /) или 'Отмена'");
        String oper = scanner.next().toLowerCase();
        if ((!oper.equals("+")) & (!oper.equals("-")) & (!oper.equals("*")) & (!oper
                .equals("/")) & (!oper.equals("отмена"))) {
            System.out.println("Неправильная операция. Попробуйте снова!");
            oper = input_operation(scanner);
            scanner.nextLine();
        }
        return oper;
    }

    // Функция отмены последнего действия
    public static void reset_operation(Deque<Double> list) {
        if (!list.isEmpty()) {
            list.removeLast();
            System.out.println("Отмена ->");
            if (list.isEmpty()) {
                list.addLast(0.0);
            }
            System.out.println(" " + list.getLast());
        }
    }

    // Функция калькуляции чисел
    public static double calculation(double num1, double num2, String oper) {
        double result = 0.0;
        switch (oper.toLowerCase()) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        return result;
    }

    // Функция добавления элементов в очередь
    public static void add_element(Deque<Double> list, double element) {
        list.addLast(element);
    }
}