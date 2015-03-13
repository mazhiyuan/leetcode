/**
 * 
 */
package zhiyuan.leetcode;

/**
 * @author mazhiyuan
 * @version For example, Given sorted array A = [1,1,1,2,2,3], Your function
 *          should return length = 5, and A is now [1,1,2,2,3]
 */
public class Remove_Duplicates_from_Sorted_Array_II {
	public int removeDuplicates(int[] A) {
		if (A == null || A.length == 0)
			return 0;
		if (A.length < 2)
			return A.length;
		int index = 2;
		for (int i = 2; i < A.length; i++)
			if (A[index - 2] != A[i])
				A[index++] = A[i];
		return index;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Duplicates_from_Sorted_Array_II r = new Remove_Duplicates_from_Sorted_Array_II();
		int[] A = { 1, 1, 1, 2, 2, 3 };
		System.out.print(r.removeDuplicates(A));
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

}
