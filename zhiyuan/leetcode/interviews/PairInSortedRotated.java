package zhiyuan.leetcode.interviews;

/**
 * Created by mazhiyuan on 2015/4/2.
 * Given an array that is sorted and then rotated around an unknown point. Find if array has a pair with given sum ‘x’. It may be assumed that all elements in array are distinct.
 * <p/>
 * Examples:
 * <p/>
 * Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
 * Output: true
 * There is a pair (6, 10) with sum 16
 * <p/>
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
 * Output: true
 * There is a pair (26, 9) with sum 35
 * <p/>
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
 * Output: false
 * There is no pair with sum 45.
 */
public class PairInSortedRotated {
    boolean pairInSortedRotated(int array[], int sum) {
        int n = array.length;
        if (n < 2)
            return false;
        int i = 0;
        while ((i + 1) < n && array[i] < array[i + 1])//  二分思想修改
            i++;
        int j = (i + 1) % n;
        int flag = array[i];
        while (i != j) {
            if (array[i] + array[j] == sum) {
                System.out.println("find a pair : " + array[i] + " and " + array[j] + " sum is " + sum);
//                return true;
                i = (n + i - 1) % n;
                j = (j + 1) % n;
                if (array[i] == flag)
                    return true;
                continue;
            }
            if (array[i] + array[j] > sum) {
                i = (n + i - 1) % n;
            } else {
                j = (j + 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array[] = {11, 15, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(new PairInSortedRotated().pairInSortedRotated(array, 17));
    }
}
