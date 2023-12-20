package Cau2;

public class SelectionSort implements SortStrategy {
    @Override
    public void sort(int[] a, boolean tangDan) {
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < len ; j++) {
                if (tangDan == true) {
                    if (a[j] < a[indexMin]) {
                        indexMin = j;
                    }
                } else {
                    if (a[j] > a[indexMin]) {
                        indexMin = j;
                    }
                }

            }
            int t = a[indexMin];
            a[indexMin] = a[i];
            a[i] = t;
        }
    }
}
