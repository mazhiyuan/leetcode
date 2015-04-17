package zhiyuan.leetcode;

import java.util.List;

/**
 * Created by mazhiyuan on 2015/4/17.
 * <p/>
 * <p/>
 * Follow up for "Find Minimum in Rotated Sorted Array":
 * What if duplicates are allowed?
 * <p/>
 * Would this affect the run-time complexity? How and why?
 * <p/>
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * <p/>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p/>
 * Find the minimum element.
 * <p/>
 * The array may contain duplicates.
 */
public class Find_Minimum_in_Rotated_Sorted_Array_II {
    public int findMin(List<Integer> nums) {
        int i = 0, j = 1;
        while (j < nums.size() && nums.get(i) <= nums.get(j)) {
            i++;
            j++;
        }
        if (j == nums.size())
            return nums.get(0);
        return nums.get(j);
    }

    public static void main(String[] args) {

    }
}
