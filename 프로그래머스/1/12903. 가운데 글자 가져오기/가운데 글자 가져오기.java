class Solution {
    public String solution(String s) {
         String answer = "";
	        char arr[] = s.toCharArray();
	        StringBuffer sb = new StringBuffer();
	        if(arr.length%2 != 0)sb.append(arr[arr.length/2]);
	        else sb.append(arr[arr.length/2-1]).append(arr[arr.length/2]);
	        return sb.toString();
    }
}