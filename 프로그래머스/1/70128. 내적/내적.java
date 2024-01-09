import java.util.*;
class Solution {
    public int solution(int[] a, int[] b) {
         int answer = 0;
        ArrayList<Integer> list  = new ArrayList<>();
        for(int i = 0;i<a.length;i++){
        	list.add(a[i]*b[i]);
        }
        for(int i = 0;i<list.size();i++){
        	answer+=list.get(i);
        }
        return answer;
    }
}