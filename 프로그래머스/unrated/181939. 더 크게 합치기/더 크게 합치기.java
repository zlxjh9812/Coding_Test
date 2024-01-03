class Solution {
    public int solution(int a, int b) {
        
        int answer = 0;
        String a1 = Integer.toString(a) + Integer.toString(b);
        String b1 = Integer.toString(b) + Integer.toString(a);
        int temp1 = Integer.parseInt(a1);
        int temp2 = Integer.parseInt(b1);
        if(temp1>temp2)answer = temp1;
        else answer = temp2;
      
        return answer;
    }
}