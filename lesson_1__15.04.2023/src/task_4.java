/*
 * Дополнительно: +Задано уравнение вида q + w = e, q, w, e >= 0.
 Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
 Требуется восстановить выражение до верного равенства.
 Предложить хотя бы одно решение или сообщить, что его нет.
 Под знаками вопросов - одна и та же цифра Ввод: 2? + ?5 = 69 Вывод: 24 + 45 = 69
 */

import java.util.Arrays;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        Scanner iScan = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String myStr = iScan.nextLine();
        iScan.close();

        //Разбиваем строку на элементы
        String[] elements = myStr.split(" ");

        boolean flag = false;

        //Подбираем цифру путём подбора
        for (int i = 0; i < 10; i++) {

            //Создаем переменные для присвоения значений элементов
            int firstNum = Integer.parseInt(elements[0].replace("?", Integer.toString(i)));
            int secondNum = Integer.parseInt(elements[2].replace("?", Integer.toString(i)));
            int result = Integer.parseInt(elements[4].replace("?", Integer.toString(i)));

            //Проверяем истинность выражения
            if (firstNum + secondNum == result) {
                System.out.printf("Решение найдено! Заменим '?' на цифру %d: ", i);
                System.out.printf("\n%d + %d = %d", firstNum, secondNum, result);
                flag = true;

            } else if (i == 9 && !flag) System.out.println("Решение отсутствует!");
        }

    }
}


