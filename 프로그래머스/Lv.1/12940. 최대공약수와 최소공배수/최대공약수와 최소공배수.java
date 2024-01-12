class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m),lcm(n,m)};
        
        return answer;
    }
	static int lcm(int n,int m){
		return (n*m/gcd(n,m));
	}
	static int gcd(int n,int m){
		while(m!=0){
			int temp = m;
			m = n%m;
			n = temp;
		}
		return n;
	}
}