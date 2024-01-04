import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
         Map<Character, Integer> targetMap = new HashMap<Character, Integer>();
	        for(int i = 0;i<keymap.length;i++){
	        	for(int z = 0;z<keymap[i].length();z++){
	        		if(targetMap.containsKey(keymap[i].charAt(z))){
if(targetMap.get(keymap[i].charAt(z))>z) targetMap.put(keymap[i].charAt(z), z+1); continue;
                    }
	        		targetMap.put(keymap[i].charAt(z), z+1);
	        	}
	        }
for(int i = 0;i<targets.length;i++){
    int temp = 0;
	        	for(int z = 0;z<targets[i].length();z++){
                    char c = targets[i].charAt(z);
	        		if(!targetMap.containsKey(c)){
                        temp = 0;  break;
                    }else{
                        temp+=targetMap.get(c);
                    }
	        	}
	        	answer[i] = temp == 0?-1:temp;
	        }
        return answer;
    }
}