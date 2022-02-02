package com.liguanqiao.leetcode.id0020.answer;

import java.util.Stack;

/**
 * 栈
 */
public class Id_0020_Stack implements Id_0020 {

    @Override
    public boolean isValid(String s) {
        if(s.isEmpty())
            return true;

        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.empty()||c!=stack.pop())
                return false;
        }

        return stack.empty();
    }

}
