/**
 *
 */
package zhiyuan.leetcode;
/**
 * @author mazhiyuan
 *         Given a string containing just the characters '(' and ')', find the
 *         length of the longest valid (well-formed) parentheses substring.
 *         <p/>
 *         For "(()", the longest valid parentheses substring is "()", which
 *         has length = 2.
 *         <p/>
 *         Another example is ")()())", where the longest valid parentheses
 *         substring is "()()", which has length = 4.
 */
class MyStack<T> {
    private Object stack[];
    private int capacity;
    private int size = 0;

    MyStack() {
        this(5);
    }

    MyStack(int i) {
        capacity = i;
        stack = new Object[capacity];
    }

    int getCapacity() {
        return capacity;
    }

    void push(T item) {
        stack[size] = item;
        size++;
        if (size == capacity) {
            capacity *= 2;
            Object newStack[] = new Object[capacity];
            for (int i = 0; i < size; i++)
                newStack[i] = stack[i];
            stack = newStack;
        }
    }

    boolean empty() {
        return size == 0;
    }

    T pop() {
        T item = peek();
        if (item == null)
            return null;
        size--;
        return item;
    }

    T peek() {
        if (empty())
            return null;
        return (T) stack[size - 1];
    }
}

public class Longest_Valid_Parentheses {
    int useStack(String s) {
        if (s == null || s.length() < 2)
            return 0;

        MyStack<Integer> stack = new MyStack<Integer>();
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

    int useIterator(String s) {
        if (s == null || s.length() < 2)
            return 0;

        int result1 = 0, result2 = 0;
        int r = 0;
        int stack = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack++;
            else {
                if (stack == 0)
                    r = 0;
                else {
                    stack--;
                    r += 2;
                    if (stack == 0 && r > result1)
                        result1 = r;
                }
            }
        }

        r = 0;
        stack = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')')
                stack++;
            else {
                if (stack == 0)
                    r = 0;
                else {
                    stack--;
                    r += 2;
                    if (stack == 0 && r > result2)
                        result2 = r;
                }
            }
        }
        return result1 > result2 ? result1 : result2;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Longest_Valid_Parentheses r = new Longest_Valid_Parentheses();
        System.out.println(r.useStack("()(()))("));
        System.out.println(r.useIterator("()(()))("));
    }

}
