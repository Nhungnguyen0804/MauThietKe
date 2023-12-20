package Cau2;

public class Context {
    private SortStrategy strategy;
    public Context(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSortStrategy(int[] a, boolean tangDan) {
        strategy.sort(a, tangDan);
    }
}
