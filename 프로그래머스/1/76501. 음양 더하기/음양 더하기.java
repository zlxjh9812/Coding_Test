class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
          int answer = 0;
	        int arr[] = new int [absolutes.length];
	        for(int i = 0;i<absolutes.length;i++){
	            if(!signs[i]) answer-=absolutes[i];
	            else answer+=absolutes[i];
	        }
	       System.out.println(answer);
	        return answer;
	    }
    }
