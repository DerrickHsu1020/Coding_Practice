
public class generaltest1 {
	public String Fibonaccisum() {
		int count=0;
		String sum="0";
		String x="1";
		String y="1";
		String z="2";
		while (count<100) {
			int z1=Integer.parseInt(String.valueOf(z.charAt(z.length()-1)));
			if (z1%2==0) {
				sum=add(z,sum);
				count++;
			}
			System.out.println(z);
			x=y;
			y=z;
			z=add(x,y);
			
		}
		return sum;
	}
	public String add(String a,String b){
        String str="";
        String strTmp="";
        int lenA=a.length();
        int lenB=b.length();
        int maxLen=(lenA>lenB) ? lenA : lenB;
        int minLen=(lenA<lenB) ? lenA : lenB;
        for(int i=maxLen-minLen;i>0;i--){
            strTmp+="0";
        }
        if (lenB>lenA) {
        	a=strTmp+a;
        }else {
        	b=strTmp+b;
        }
        
        int tempA,tempB,result;
        int sc=0;
        for(int i=b.length()-1;i>=0;i--){
            tempA=Integer.parseInt(String.valueOf(a.charAt(i)));
            tempB=Integer.parseInt(String.valueOf(b.charAt(i)));
            result=tempA+tempB+sc;
            if (result>=10 && i!=0){
            	result=result-10;
            	sc=1;
            }else {
            	sc=0;
            }
            str=String.valueOf(result)+str;  
        }
        return str;
    }
}
