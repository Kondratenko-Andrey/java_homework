import java.util.LinkedList;
import java.util.Random;

//2) Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
//
//        Пример:
//        [1, 2, 3, 4, 5, 6, 7]
//        spisok.enqueue(8)
//        [1, 2, 3, 4, 5, 6, 7,8]
//        spisok.dequeue
//        1
//        [2, 3, 4, 5, 6, 7,8]
//        spisok.first()
//        2
//        [2, 3, 4, 5, 6, 7,8]
public class task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        final int n = 10;
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(1, 11));
        }

        System.out.println(list);
        enqueue(list, 16);

        System.out.println(list);

        System.out.println(dequeue(list));
        System.out.println(list);

        System.out.println(first(list));
        System.out.println(list);

    }
    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int el){
        list.add(el);
        return list;
    }

    public static int dequeue(LinkedList<Integer> list){
        int res = list.pop();
        return res;
    }

    public static int first(LinkedList<Integer> list){
        int res = list.get(0);
        return res;
    }

}
