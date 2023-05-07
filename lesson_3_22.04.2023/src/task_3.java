import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Random rnd = new Random();

        final int myListLength = rnd.nextInt(10, 21);

        for (int i = 0; i < myListLength; i++)
            myList.add(rnd.nextInt(-15, 16));

        System.out.println("Исходный список имеет вид:");
        System.out.println(myList);

        System.out.printf("Максимальное значение элемента исходного массива: %d\n", maxValue(myList));
        System.out.printf("Минимальное значение элемента исходного массива: %d\n", minValue(myList));
        System.out.printf("Среднее значение элемента исходного массива: %d", midValue(myList));

    }

    public static int maxValue(ArrayList<Integer> defList) {
        int res = defList.get(0);
        for (int i = 1; i < defList.size(); i++)
            if (defList.get(i) > res) res = defList.get(i);
        return res;
    }

    public static int minValue(ArrayList<Integer> defList) {
        int res = defList.get(0);
        for (int i = 1; i < defList.size(); i++)
            if (defList.get(i) < res) res = defList.get(i);
        return res;
    }

    public static int midValue(ArrayList<Integer> defList) {
        int midVal = minValue(defList) + (maxValue(defList) - minValue(defList)) / 2;
        int res = defList.get(0);
        for (int i = 1; i < defList.size(); i++)
            if (Math.abs(defList.get(i) - midVal) < Math.abs(res - midVal)) res = defList.get(i);
        return res;
    }
}
