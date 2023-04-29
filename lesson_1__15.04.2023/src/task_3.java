/*
Реализовать простой калькулятор
Введите первое число: 12
Введите операцию: +
Введите второе число: 1
Ответ: 13
*/

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {

        Scanner iScan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = iScan.nextInt();

        System.out.print("Введите операцию: ");
        String operation = iScan.next();

        System.out.print("Введите второе число: ");
        int secondNum = iScan.nextInt();

        iScan.close();

        double res = 0;

        switch (operation) {
            case "+":
                res = firstNum + secondNum;
                break;
            case "-":
                res = firstNum - secondNum;
                break;
            case "*":
                res = firstNum * secondNum;
                break;
            case "/":
                res = (double) firstNum / secondNum;
        }

        System.out.println("Ответ: " + res);


    }
}
