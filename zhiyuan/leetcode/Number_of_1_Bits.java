package zhiyuan.leetcode;

/**
 * @author mazhiyuan
 *         Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 *         <p/>
 *         For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 *
 *         hamming code
 *         python:
 *         bin(n).count('1')
 */
public class Number_of_1_Bits {
    int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n &= n - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Number_of_1_Bits().hammingWeight(12));
        //斐波那契
        int f=0;
        int g=1;
        for(int i=0;i<=15;i++){
            System.out.println(f);
            f=f+g;
            g=f-g;
        }

        String s="";
        for(int n=10;n>0;n/=2)
            s+=n%2;
        System.out.println(s);
    }
}
