class Solution {
    public int solution(int z) {
    int i = 0;
        long num = z;
        System.out.println(i);
        if (num == 1) return 0;
        while(num!=1){
        	if(i >500) return -1;
        	if(num == 1 )break;

        	if(num%2 == 0)num = num/2;
        	else if(num%2 != 0 )num = num*3+1;
        	i++;
        	
        }
        return i;
    }
}