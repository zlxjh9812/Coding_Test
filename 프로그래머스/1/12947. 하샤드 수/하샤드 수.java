class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int A = x;
        int sum =0;
        while(x>0){
            sum += x%10;
            x=x/10;
        }
        
		System.out.println(sum);
        if(A%sum != 0) answer = false;
        return answer;
    }
}