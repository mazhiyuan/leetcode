/**
 *
 */
package zhiyuan.leetcode;

/**
 * @author mazhiyuan
 *         Given an input string, reverse the string word by word. For example,
 *         Given s = "the sky is blue", return "blue is sky the".
 *         <p/>
 *         Clarification:
 *         <p/>
 *         What constitutes a word? A sequence of non-space characters
 *         constitutes a word. Could the input string contain leading or
 *         trailing spaces? Yes. However, your reversed string should not
 *         contain leading or trailing spaces. How about multiple spaces
 *         between two words? Reduce them to a single space in the reversed
 *         string.
 */
public class Reverse_Words_in_a_String {

    public String reverseWords(String s) {
        if (s == null || s.equals(""))
            return s;

        s = s.trim();
        String strs[] = s.split(" ");
        String res = "";
        for (int i = strs.length - 1; i > -1; i--)
            if (!strs[i].equals(""))
                res += strs[i] + " ";

        return res.trim();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Reverse_Words_in_a_String r = new Reverse_Words_in_a_String();
        System.out.print(r.reverseWords("the sky  is blue"));
    }

}
