//2. Вывести все простые числа от 1 до 1000

public class task_2 {
    public static void main(String[] args) {

        int n = 1000;

        int[] arr = new int[1001];

        for (int i = 0; i <= 1000; i++) {
            arr[i] = i;
        }

        arr[1] = 0;
        int i = 2;
        while (i <= n) {
            if (arr[i] != 0) {
                int j = i + i;
                while (j <= n) {
                    arr[j] = 0;
                    j = j + i;
                }
            }
            i++;
        }

        System.out.println("Ниже представлен список простых чисел от 1 до 1000:");

        for (int el : arr)
            if (el != 0) System.out.printf("% d", el);

    }
}
