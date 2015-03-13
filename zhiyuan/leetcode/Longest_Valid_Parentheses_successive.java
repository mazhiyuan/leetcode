/**
 * 
 */
package zhiyuan.leetcode;

/**
 * @author mazhiyuan
 * @version Given a string containing just the characters '(' and ')', find the
 *          length of the longest valid (well-formed) parentheses substring.
 * 
 *          For "(()", the longest valid parentheses substring is "()", which
 *          has length = 2.
 * 
 *          Another example is ")()())", where the longest valid parentheses
 *          substring is "()()", which has length = 4.
 *          
 *          OK,I think it should be successive characters,but...
 */
public class Longest_Valid_Parentheses_successive {
	public int longestValidParentheses(String s) {
		if (s == null || s.equals("") || s.length() == 1)
			return 0;
		char cs[] = s.toCharArray();
		int p1 = 0;
		int p2 = 0;
		for (int i = 0; i < cs.length && i + 1 < cs.length;) {
			if (cs[i] == '(' && cs[i + 1] == ')') {
				p1++;
				i += 2;
			} else {
				p2 = p2 > p1 ? p2 : p1;
				p1 = 0;
				i++;
			}
		}

		return p1 > p2 ? p1 * 2 : p2 * 2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Valid_Parentheses_successive r = new Longest_Valid_Parentheses_successive();
		System.out.print(r.longestValidParentheses("()(()"));
//		Thread.MAX_
	}
}
