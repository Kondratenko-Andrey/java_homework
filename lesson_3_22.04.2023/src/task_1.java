//(Дополнительно) Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(7, 15)];

        for (int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt(1, 20);

        System.out.println(Arrays.toString(arr));
        int[] arrSort = sortMerge(arr);

        System.out.println(Arrays.toString(arrSort));


    }


    public static int[] sortMerge(int[] list) {
        if (list == null) {
            System.out.println("Your array is empty!");
            return null;
        }
        if (list.length < 2) {
            return list;
        }
        int[] left = new int[list.length / 2];
        int[] right = new int[list.length - list.length / 2];
        System.arraycopy(list, 0, left, 0, list.length / 2);
        System.arraycopy(list, list.length / 2, right, 0, list.length - list.length / 2);
        return merge(sortMerge(left), sortMerge(right));
    }

    public static int[] merge(int a[], int b[]) {
        int[] res = new int[a.length + b.length];
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;

            }
            k++;
        }
        while (i < n) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
}
