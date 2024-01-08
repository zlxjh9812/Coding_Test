import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
       int An = 0;
	       int temp[] = new int[A.length];
	       int ans[] = new int [A.length];
	       Arrays.sort(A);
	       Arrays.sort(B);
	       int NB []= new int[B.length];
	       for(int i = 0;i<B.length;i++){
	    	   NB[i] = B[B.length-i-1];
	       }
	       for(int i = 0;i<A.length;i++){
	    	   temp[i]+=A[i] * NB[i];
	       }
	       for(int i = 0;i<A.length;i++){
	    	   An+=temp[i];
	       }
	       
        return An;
    }
}