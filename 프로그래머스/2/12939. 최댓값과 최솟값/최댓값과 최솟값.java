import java.util.*;
class Solution {
    public String solution(String s) {
    String[]arr = s.split(" ");
	        int[] arr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
	        Arrays.sort(arr2);
	        return arr2[0] + " " + arr2[arr2.length-1];

    }
}