/**
 *
 */
package zhiyuan.leetcode;

/**
 * @author mazhiyuan
 *         Given an array of integers, every element appears three times except
 *         for one. Find that single one.
 *         <p/>
 *         Note: Your algorithm should have a linear runtime complexity. Could
 *         you implement it without using extra memory?
 */
public class Single_Number_II {
    public int singleNumber(int[] A) {
        //maybe the best answer
        int ones = 0, twos = 0;
        for (int i = 0; i < A.length; i++) {
            ones = (ones ^ A[i]) & ~twos;
            twos = (twos ^ A[i]) & ~ones;
        }
        return ones;
        //another one
//		int result=0;
//        int[] bits=new int[32];
//        for (int i = 0; i < 32; i++) {
//            for(int j = 0; j < A.length; j++) {
//                bits[i] += A[j] >> i &1;
//                bits[i] %= 3;
//            }
//
//            result |= (bits[i] << i);
//        }
//        return result;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Single_Number_II r = new Single_Number_II();
        int A[] = {1, 2, 1, 2, 1, 1, 2, 2, 3};
        System.out.print(r.singleNumber(A));
    }

}
