//1. Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int nT = n * (n + 1) / 2;

        int Fn = 1;

        for (int i = 2; i <= n; i++)
            Fn *= i;

        System.out.printf("n-ое треугольное число равно: %d", nT);
        System.out.println();
        System.out.printf("n! равно: %d", Fn);

    }
}
