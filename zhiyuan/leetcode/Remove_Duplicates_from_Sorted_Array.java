/**
 * 
 */
package zhiyuan.leetcode;

/**
 * @author mazhiyuan
 * @version given a sorted array,remove the duplicates in place such that each
 *          element appear only once and return the new length. do this with
 *          constant memory e.g. array a={1,1,2} return length=2,and now a={1,2}
 */
public class Remove_Duplicates_from_Sorted_Array {

	public int removeDuplicates(int[] A) {
		if(A==null||A.length==0)
            return 0;
		int index = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[index] != A[i])
				A[++index] = A[i];
		}
		return index + 1;
	}

}
