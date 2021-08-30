package com.java.leetcode;

import java.util.Stack;

class Solution {
	public static void main(String[] args) {
		
		Solution solution = new Solution();
		System.out.println(solution.isValid("()"));
	}
   	
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length(); i ++){
        	if(!stack.empty())
            if(stack.isEmpty()){
                stack.add(s.charAt(i));
                System.out.println(stack);         
            }else if(stack.peek().charValue()  == s.charAt(i)){
                stack.pop();
                System.out.println(stack); 
            }else{
                stack.add(s.charAt(i));
                System.out.println(stack); 
            }
        }

        if(stack.isEmpty())
        return true;
        else
        return false;
    }
}
