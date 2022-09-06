package Implementing_strategy;

public class Main {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Go Go");
        sortedList.add("PHP");
        sortedList.add("C#");
        sortedList.add("Python");

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}