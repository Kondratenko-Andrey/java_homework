// Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Random rnd = new Random();

        final int myListLength = rnd.nextInt(10, 21);

        for (int i = 0; i < myListLength; i++)
            myList.add(rnd.nextInt(1, 11));

        System.out.println("Исходный список имеет вид:");
        System.out.println(myList);

        for (int i = myListLength - 1; i >= 0; i--)
            if (myList.get(i) % 2 == 0) myList.remove(i);

        System.out.println("Список после удаления чётных значений элементов имеет вид:");
        System.out.println(myList);
    }
}