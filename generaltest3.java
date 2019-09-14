/*

Write a function in a language of your choice which, when passed a positive integer returns
true if the decimal representation of that integer contains no odd digits and otherwise returns
false.

*/

public class generaltest3 {
	public boolean solution3(int x) {
		if (x<0)
			return false;
		while(x>0) {
			int digit = x%10;
			if (digit % 2 != 0)
				return false;
			x=x/10;
		}
		return true;
	}
}
