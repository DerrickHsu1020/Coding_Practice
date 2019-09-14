import java.util.*;

public class generaltest2 {
    public int[] solution2(int[] a, int[] b) {
		if (a.length==0||b.length==0)
			return new int[0];
		if ((a[a.length-1]<b[0])||(b[b.length-1]<a[0]))
			return new int[0];
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
        	if (a[i]>b[0] && a[i]<b[b.length-1] && !set.contains(a[i]))
        		set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                intersect.add(b[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
