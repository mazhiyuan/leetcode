package zhiyuan.leetcode;

/**
 * Created by mazhiyuan on 2015/4/16.
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int p = x;
        int q = 0;

        while (p >= 10) {
            q *= 10;
            q += p % 10;
            p /= 10;
        }

        return q == x / 10 && p == x % 10;//躲过溢出
    }

    public boolean isPalindrome1(int x) {
        if(x<0)
            return false;
        String s = Integer.toString(x); //先转为string
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(new Palindrome_Number().isPalindrome1(-2147483648));
    }
}
