package zhiyuan.leetcode;

/**
 * Created by mazhiyuan on 2015/4/17.
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * <p/>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p/>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p/>
 * You may assume no duplicate exists in the array.
 */
public class Search_in_Rotated_Sorted_Array {
    public int search(int[] A, int target) {
        if (A == null || A.length == 0)
            return -1;
        if (A.length == 1)
            if (A[0] == target)
                return 0;
            else
                return -1;
        int i = 0, j = 1;
        while (j < A.length-1 && A[i] < A[j]) {
            i++;
            j++;
        }
        if (target >= A[0] && target <= A[i])
            return find(A, 0, i, target);
        if (target >= A[j] && target <= A[A.length - 1])
            return find(A, j, A.length - 1, target);
        return -1;
    }

    private int find(int[] a, int i, int j, int target) {
        if (target == a[i])
            return i;
        if (target == a[(i + j) >> 1])
            return (i + j) >> 1;
        if (target == a[j])
            return j;
        if (target > a[i] && target < a[(i + j) >> 1])
            return find(a, i, (i + j) >> 1, target);
        if (target > a[(i + j) >> 1] && target < a[j])
            return find(a, (i + j) >> 1, j, target);

        return -1;
    }

    public static void main(String[] args) {
        int A[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(new Search_in_Rotated_Sorted_Array().search(A, 10));
    }
}
