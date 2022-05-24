import java.util.Arrays;

public class BubbleSort {
    public int[] nums;
    private static int sortedCount = 0;

    public BubbleSort(int... nums){
        this.nums = nums;
    }

    public String sort(){
        String s = "Before Bubble Sort: "+Arrays.toString(nums);
        //O(n^2)
    while(!(sortedCount == nums.length-1)){
        sortedCount = 0;
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            } else {
                sortedCount++;
            }
        }
    }   s += "\nAfter Bubble Sort: "+Arrays.toString(nums);
        return s;
    }
}
