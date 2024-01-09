import java.util.*;
class Solution
{
    public int solution(String s)
    {
           int answer = 0;
	       Stack<Character> S = new Stack<>();
	       for(int i = 0;i<s.length();i++){
	    	   char c = s.charAt(i);
	    	   if(!S.isEmpty() && S.peek() == c){
	    		   S.pop();
	    	   }else{
	    		   S.push(c);
	    	   }
	       }
	       if(S.isEmpty()) answer = 1;
	       
	        
	        return answer;
	        
    }
}