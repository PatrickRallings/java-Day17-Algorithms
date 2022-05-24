import java.util.Arrays;

public class BubbleSort {
    public static int sortedCount = 0;
    public static void main(String[] args){
//        int[] nums = {4, 1, 3, 9, 7};
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before Sort: "+Arrays.toString(nums));
        //Below: O(n^2)
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
    }
        System.out.println("After Sort: "+Arrays.toString(nums));

    }
}
