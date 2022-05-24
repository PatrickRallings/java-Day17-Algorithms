import java.util.Arrays;

public class QuickSort {
    public int[] nums;

    public QuickSort(int... nums){
        this.nums = nums;
    }

    public void sort(){
        System.out.println("Before Quicksort: "+Arrays.toString(nums));
        sort(this.nums, 0, this.nums.length-1);
        System.out.println("After Quicksort: "+Arrays.toString(nums));
    }

    public void sort(int[] nums, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }
        int pivot = nums[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while(leftPointer < rightPointer){
            while(nums[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (nums[rightPointer] >= pivot && leftPointer < rightPointer)
                rightPointer--;
            swap(leftPointer, rightPointer);
        }
        swap(leftPointer, highIndex);
        sort(this.nums, lowIndex, leftPointer-1);
        sort(this.nums, leftPointer+1, highIndex);
    }

    public void swap(int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public int[] numsToString() {
        return nums;
    }
}