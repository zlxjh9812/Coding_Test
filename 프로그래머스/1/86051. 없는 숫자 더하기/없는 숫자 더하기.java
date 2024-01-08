class Solution {
    public int solution(int[] numbers) {
       		        int answer = 0;
		        boolean arr[] = new boolean[10];
		        for(int i = 0;i<arr.length;i++){
		        	arr[i] = false;
		        }
		        for(int i = 0;i<numbers.length;i++){
		        	int temp = numbers[i];
		        	arr[temp] = true;
		        }
		        for(int i = 0;i<arr.length;i++){
		        	if(!arr[i])answer = answer +(i);
		        }
		        return answer;
		    }
	    
    }
