package zhiyuan.leetcode;

/**
 * Created by mazhiyuan on 2015/4/16.
 */
public class Reverse_Integer {
    public final int tenthMaxValue = Integer.MAX_VALUE / 10;
    public int reverse(int x) {
        int sign = 1;
        int digits = 0;
        int result = 0;

        if (x < 0) {
            sign = -1;
            digits = x * sign;
        } else {
            digits = x;
        }

        while (digits > 0)
        {
            int digit = digits % 10;
            if (result > tenthMaxValue
                    || (result == tenthMaxValue && digit > 8))    // overflow
                return 0;
            result = 10 * result + digit;
            digits /= 10;
        }

        return result * sign;
    }

    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
    public int reverse1(int x) {
        String s=Integer.toString(x);
        try{
            if(s.charAt(0)=='-'){
                return Integer.parseInt("-"+reverse(s.substring(1,s.length())));
            }else{
                return Integer.parseInt(reverse(s));
            }
        }catch(Exception e){//说明overflow
            return 0;
        }
    }

    public static void main(String[] args) {
//        System.out.println(new Reverse_Integer().reverse(1534236469));
//        System.out.println(-2147483648-(-2147483648)-(-2147483648));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(-1*Integer.MIN_VALUE);
    }

}
