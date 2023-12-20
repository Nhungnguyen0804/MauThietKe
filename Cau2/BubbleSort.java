package Cau2;

public class BubbleSort implements SortStrategy {
    @Override
    public void sort(int[] a, boolean tangDan) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (tangDan == true) {
                    if (a[i] > a[j]) {
                        int t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    }
                } else {
                    if (a[i] < a[j]) {
                        int t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    }
                }

            }
        }
    }
}
