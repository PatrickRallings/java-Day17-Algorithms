public class Main {
    public static void main(String[] args){
        //Bubble Sort
        BubbleSort bubble1 = new BubbleSort(4, 1, 3, 9, 7);
        BubbleSort bubble2 = new BubbleSort(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        System.out.println(bubble1.sort());
        System.out.println(bubble2.sort());

        //Quicksort
        QuickSort quick1 = new QuickSort(4, 1, 3, 9, 7);
        QuickSort quick2 = new QuickSort(2, 1, 6, 10, 4, 1, 3, 9, 7);
        quick1.sort();
        quick2.sort();

        //Search Pattern
        SearchPattern searchPat1 = new SearchPattern("batmanandrobinarebat", "bat");
        SearchPattern searchPat2 = new SearchPattern("abesdu", "edu");
        searchPat1.search();
        searchPat2.search();
    }
}
