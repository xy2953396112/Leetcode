package Leetcode.code_155_Min_Stack;

import java.util.Stack;

public class Solution {


    static class Element
    {
        final int value;
        final int min;
        Element(final int value, final int min)
        {
            this.value = value; //值，
            this.min = min;    //最小值
        }
    }
    final Stack<Element> stack = new Stack<>();

    public void push(int x) {
        final int min = (stack.empty()) ? x : Math.min(stack.peek().min, x);
        stack.push(new Element(x, min));
    }

    public void pop()
    {
        stack.pop();
    }

    public int top()
    {
        return stack.peek().value;
    }

    public int getMin()
    {
        return stack.peek().min;
    }
}
