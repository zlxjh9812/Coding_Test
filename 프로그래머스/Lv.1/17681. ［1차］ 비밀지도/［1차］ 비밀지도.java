class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
                String[] answer = new String[n];
	        for(int i = 0;i<n;i++){
	        	int temp = arr1[i] | arr2[i];
	        	String L = Integer.toBinaryString(temp).replace("1", "#").replace("0", " ");
	        	while(L.length()<n){
	        		L = " " + L;
	        	}
	        	answer[i] = L;
	        		
	        }
	        return answer;
    }
}