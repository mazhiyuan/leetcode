package zhiyuan.leetcode;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1.
 * Created by mazhiyuan on 2015/8/13.
 */
public class No3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int start = 0, temp = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!(s.indexOf(s.charAt(i), start) == i)) {
                temp = i - start;
                start = s.indexOf(s.charAt(i), start) + 1;
                max = temp > max ? temp : max;
            }
        }

        temp = s.length() - start;
        max = temp > max ? temp : max;
        return max;
    }

    public static void main(String[] args) {
        String s = "ac";
        System.out.println(new No3_Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring(s));
    }
}
