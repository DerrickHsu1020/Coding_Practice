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
