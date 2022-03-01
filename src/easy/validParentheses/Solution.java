package easy.validParentheses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public boolean isValidSECOND(String s) {
        char[] arr = s.toCharArray();
        LinkedList<Character> list = new LinkedList();

        HashMap<Character, Character> close = new HashMap<>();
        close.put(')', '(');
        close.put(']', '[');
        close.put('}', '{');

        HashMap<Character, Character> open = new HashMap<>();
        open.put('(', ')');
        open.put('[', ']');
        open.put('{', '}');

        for (char item : arr) {
            if (close.containsKey(item)) {
                if (list.isEmpty()) {
                    return false;
                }
                char last = list.peekLast();
                if (item == open.get(last)){
                    list.removeLast();
                } else {
                    return false;
                }

            } else {
                list.add(item);
            }
        }
        return list.isEmpty();
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public boolean isValid3FIRST(String s) {
        char[] arr = s.toCharArray();
        LinkedList<Character> list = new LinkedList();
        list.add(arr[0]);

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == ')' || arr[i] == ']' || arr[i] == '}'){
                if(list.isEmpty()){
                    return false;
                }
                char last = list.peekLast();

                switch(last){
                    case '(':
                        if(arr[i] == ')'){
                            list.removeLast();
                            break;
                        }
                        return false;
                    case '[':
                        if(arr[i] ==']'){
                            list.removeLast();
                            break;
                        }
                        return false;
                    case '{':
                        if(arr[i] =='}'){
                            list.removeLast();
                            break;
                        }
                        return false;
                }
            } else {
                list.add(arr[i]);
            }
        }
        return list.isEmpty();
    }
}
