class Solution {
    public String solution(String phone_number) {
        char[] C = phone_number.toCharArray();
       for(int i = 0;i<C.length-4;i++){
    	   C[i] = '*';
       }
        return new String(C);
    }
    }
