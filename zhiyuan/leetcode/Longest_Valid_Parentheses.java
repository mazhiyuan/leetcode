/**
 * 
 */
package zhiyuan.leetcode;

import java.util.Stack;

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
 */
public class Longest_Valid_Parentheses {
	public int longestValidParentheses(String s) {
		if (s == null || s.length() < 2)
			return 0;

		Stack<Integer> stack = new Stack<Integer>();
		char[] cs = s.toCharArray();
		int max = 0, last = -1;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == '(')
				stack.push(i);
			else {
				if (stack.empty())
					last = i;
				else {
					stack.pop();
					if (stack.empty())
						max = max > (i - last) ? max : i - last;
					else
						max = max > (i - stack.peek()) ? max : i - stack.peek();

				}
			}
		}
		
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Longest_Valid_Parentheses r = new Longest_Valid_Parentheses();
//		System.out.print(r.longestValidParentheses("(()"));
        System.out.println(true||false);
    }

}
