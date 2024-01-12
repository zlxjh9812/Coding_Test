import java.util.*;
class Solution {
    public String solution(String s) {
        char[] A = s.toCharArray();
        Arrays.sort(A);
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<A.length;i++){
        	sb.append(A[A.length-i-1]);
        }
        return sb.toString();
    }
}