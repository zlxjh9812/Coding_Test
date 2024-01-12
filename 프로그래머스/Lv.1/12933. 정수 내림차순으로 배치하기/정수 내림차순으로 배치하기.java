import java.util.*;
class Solution {
    public long solution(long n) {
     	String s = Long.toString(n);
		char[] c = s.toCharArray();
		Arrays.sort(c);
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<c.length;i++){
			sb.append(c[c.length-i-1]);
		}
		return Long.parseLong(sb.toString());
    }
}