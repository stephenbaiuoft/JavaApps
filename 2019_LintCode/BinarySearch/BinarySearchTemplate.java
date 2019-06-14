package BinarySearch;

import java.util.Arrays;

public class BinarySearchTemplate {
    public int find(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left + 1 < right) {
            int mid = left + (right-left)/2;
            if (target > nums[mid] ) { // target greater than mid, left can be mid
                left = mid ; //注意 这里直接=mid就可以了 不用担心无限循环 --》 因为 left + 1 < right!!!! 解决了 infinite loop的问题
            } else {
                right = mid;
            }
        }

        // could be left or right, make the decision here
        return nums[left] == target? left: right;
    }
}
