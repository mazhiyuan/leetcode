package zhiyuan.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p/>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p/>
 * You may assume that each input would have exactly one solution.
 * <p/>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * <p/>
 * Created by mazhiyuan on 2015/8/12.
 */
public class No1_TwoSum {
    /**
     * 315ms
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_1(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++)
            res.put(nums[i], i);

        int[] tar = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (res.get(target - nums[i]) != null) {
                tar[0] = i + 1;
                tar[1] = res.get(target - nums[i]) + 1;
                if (tar[0] == tar[1])
                    continue;
                return tar;
            }
        }

        return null;
    }

    public int[] twoSum_2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(target - nums[i], i + 1);
            else
                return new int[]{map.get(nums[i]), i + 1};
        }
        return new int[]{-1, -1};
    }

    /**
     * index changed after sorted
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum_3(int[] nums, int target) {
        Arrays.sort(nums);
        int max = nums.length - 1, min = 0;
        while (min < max) {
            if (nums[min] + nums[max] == target)
                return new int[]{min + 1, max + 1};
            if (nums[min] + nums[max] > target)
                max--;
            else min++;
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = {3, 4, 2};
        int res[] = new No1_TwoSum().twoSum_3(nums, 6);
        System.out.println(res[0] + "|" + res[1]);
    }
}
