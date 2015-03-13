/**
 * 
 */
package zhiyuan.leetcode;

/**
 * @author mazhiyuan
 * @version Given an array of integers, every element appears twice except for
 *          one. Find that single one. Note: Your algorithm should have a linear
 *          runtime complexity. Could you implement it without using extra
 *          memory?
 */
public class Single_Number {
	public int singleNumber(int[] A) {
		if (A == null || A.length == 0) {
			return -1;
		}
		int r = 0;
		for (int i = 0; i < A.length; i++)
			r ^= A[i];

		return r;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_Number r = new Single_Number();
		int A[] = { 1, 1,2,2, 2, 1, 3 };
		System.out.print(r.singleNumber(A));
	}

}
