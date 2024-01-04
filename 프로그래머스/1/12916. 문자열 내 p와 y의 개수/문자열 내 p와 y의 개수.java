class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int p = 0;
        int y = 0;
        for(int i = 0;i<s.length();i++){
            char c = Character.toUpperCase(s.charAt(i));
            
            if(c == 'P') p++;
            else if(c == 'Y') y++;
        }
        if(p == y) answer = true;
       

        return answer;
    }
}