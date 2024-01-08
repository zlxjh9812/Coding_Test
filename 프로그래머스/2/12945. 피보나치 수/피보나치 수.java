class Solution {
    public double solution(int n) {
        
           
        long f[] = new long[n+1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        if(n == 2) return 1;
        for(int i = 3;i<=n;i++){
            f[i] = f[(i-2)]%1234567 + f[(i-1)]%1234567;
        }
        return (f[n]%1234567);
    }
}