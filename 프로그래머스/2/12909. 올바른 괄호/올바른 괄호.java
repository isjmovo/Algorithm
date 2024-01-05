import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int openN = 0;
        int closeN = 0;
        
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            }
            else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    answer = false;
                }
            }
        }
        
        if (!stack.isEmpty()) answer = false;

        return answer;
    }
}