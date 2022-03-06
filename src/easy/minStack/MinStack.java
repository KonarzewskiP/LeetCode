package easy.minStack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minVal = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        stack.push(val);
        if (minVal.empty() || val < minVal.peek()) {
            minVal.push(val);
        }
    }

    public void pop() {
        if (minVal.peek().equals(stack.pop())){
            minVal.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minVal.peek();
    }
}
