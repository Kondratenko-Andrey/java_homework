//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        scanner.close();

        int[] myArr = intArrCreate(size);

        System.out.println(Arrays.toString(myArr));

        System.out.println(Arrays.toString(bubbleSortLog(myArr)));

    }

    private static int[] bubbleSortLog(int[] myArr) {
        String fileName = "bubbleSortLog.txt";
        File file = new File(fileName);

        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(Arrays.toString(myArr) + " - исходный массив");

            for (int i = 0; i < myArr.length - 1; i++) {
                for (int j = 0; j < myArr.length - 1 - i; j++) {
                    if (myArr[j] > myArr[j + 1]) {
                        writer.write(String.format("\nТ.к. %d > %d - меняем элементы местами\n",
                                myArr[j], myArr[j + 1]));
                        int temp = myArr[j + 1];
                        myArr[j + 1] = myArr[j];
                        myArr[j] = temp;
                        writer.write(Arrays.toString(myArr));
                    }
                }
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
        return myArr;
    }

    private static int[] intArrCreate(int size) {
        //Метод для создания массива с элементами int размера size
        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++)
            array[i] = random.nextInt(0, 11);
        return array;
    }
}
