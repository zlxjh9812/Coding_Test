import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
       ArrayList<Integer>list = new ArrayList<>();
	        for(int i = 0;i<arr.length;i++){
	            if(arr[i]%divisor == 0) list.add(arr[i]);
	        }
	        int answer[] = new int[list.size()];
	        if(list.isEmpty())
            {
                int arr1[] = new int [1];
                arr1[0] = -1;
                return arr1;
            }
	        Collections.sort(list);
	        for(int i = 0;i<list.size();i++){
	        	answer[i] = list.get(i);
	        }
	        return answer;
    }
}