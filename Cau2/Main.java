package Cau2;

public class Main {
    public static void showArray(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = {2,3,7,11,4,1,9};

        // bubble sort tang dan
        System.out.println("bubble sort tang dan:");
        Context context = new Context(new BubbleSort());
        context.executeSortStrategy(a, true);
        showArray(a);

        // bubble sort giam dan
        System.out.println("bubble sort giam dan:");
        context = new Context(new BubbleSort());
        context.executeSortStrategy(a, false);
        showArray(a);

        // selection sort tang dan
        System.out.println("selection sort tang dan:");
        context = new Context(new SelectionSort());
        context.executeSortStrategy(a, true);
        showArray(a);

        // selection sort giam dan
        System.out.println("selection sort giam dan:");
        context = new Context(new SelectionSort());
        context.executeSortStrategy(a, false);
        showArray(a);
    }
}
