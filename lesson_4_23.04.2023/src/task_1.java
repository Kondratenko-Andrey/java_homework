//1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
// который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        final int n = 10;
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(1, 21));
        }

        System.out.println(list);
        System.out.println(listRevers(list));
    }

    public static LinkedList<Integer> listRevers(LinkedList<Integer> list) {
        LinkedList<Integer> resList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            resList.add(list.get(i));
        }
        return resList;
    }
}
