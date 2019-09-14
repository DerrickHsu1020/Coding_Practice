/*
Write a Java function which, when passed a string containing a mixture of bracket characters -
i.e. ‘{‘, ‘}’, ‘[‘, ‘]’, ‘(‘ and ‘)’, returns true if the brackets in the string are correctly balanced, and
false otherwise. E.g. when called with “{[(())]()}” it should return true, but “{[(()])()}” should
return false. Non-bracket characters in the string should be ignored.
*/

import java.util.*;
public class test2 {
	public boolean solution2(String s) {
		if (s.length()==0)
			return true;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c =s.charAt(i);
			if (c=='{') {
				stack.push('}');
			}else if(c=='(') {
				stack.push(')');
			}else if(c=='[') {
				stack.push(']');
			}else if( c=='}' || c==')'||c==']') {
				if (stack.isEmpty()){
					return false;
				}else {
					char r=stack.pop();
					if (c!=r) {
						return false;
					}
				}
			}
		}
		if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
	}
}
