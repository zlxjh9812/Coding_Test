
class Solution {
    public String solution(String s) {
            int max = Integer.MIN_VALUE;
		 int min = Integer.MAX_VALUE;
		 
	        String[]arr = s.split(" ");
	        for(int i = 0;i<arr.length;i++){
	        	if(min>Integer.parseInt(arr[i])){
	        		min = Integer.parseInt(arr[i]);
	        	}
	        	if(max<Integer.parseInt(arr[i])){
	        		max = Integer.parseInt(arr[i]);
	        	}
	        }
	        StringBuffer sb = new StringBuffer();
	        sb.append(min).append(" ").append(max);
	        return sb.toString();
    }
}