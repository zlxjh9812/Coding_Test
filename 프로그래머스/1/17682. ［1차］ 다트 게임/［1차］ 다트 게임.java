import java.util.*;
class Solution {
    public int solution(String DR) {     
            int answer = 0;
	        String temp ="";
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        for(int i = 0;i<DR.length();i++){
	            char c = DR.charAt(i); 	
	            if(48<=c && c<=57){
	                temp+=c;
	            }else if(c == 'S'){
	            	list.add((int) Math.pow(Integer.parseInt(temp), 1));
	            	temp = "";
	            	
	            }else if(c == 'D'){
	            	
	            	list.add((int) Math.pow(Integer.parseInt(temp), 2));
	            	temp = "";
	            }else if(c == 'T'){
	            	list.add((int) Math.pow(Integer.parseInt(temp), 3));
	            	temp = "";
	            }else if(c == '#'){
	            	
	            	int li =list.get(list.size()-1);
	            	li=li*-1;
	            	list.set(list.size()-1, li);
	            }else if(c=='*'){
	            	for(int z = list.size()-2;z<list.size();z++){
                        if(z<0)continue;
	            		int listTemp = list.get(z);
	            		list.set(z, listTemp*2);
	            		
	            	}
	            }
	        }
	        for(int i = 0;i<list.size();i++){
	        	
	        	answer+=list.get(i);
	        }
	        
	        
	        return answer;
	    }
    }
