package zhiyuan.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * Created by mazhiyuan on 2015/4/17.
 */
public class Longest_Common_Prefix {
    public String longestCommonPrefix(List<String> strs) {
        if (strs == null || strs.size() == 0)
            return "";
        if (strs.size() == 1)
            return strs.get(0);

        int i = strs.get(0).length();
        char cs[] = strs.get(0).toCharArray();
        for (String lc : strs) {
            int j = 0;
            for (char ca : cs) {
                if (j < lc.length() && ca == lc.charAt(j))
                    j++;
                else
                    break;
            }
            if (i > j)
                i = j;
        }
        return strs.get(0).substring(0, i);
    }

    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("abcad");
        ls.add("abce");
        ls.add("abcd");
        ls.add("abdc");
        ls.add("ab");
        ls.add("acdsd");
        System.out.println(new Longest_Common_Prefix().longestCommonPrefix(ls));
    }
}
