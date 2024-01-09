class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int z = 0; z < arr1[i].length; z++) {
				answer[i][z] = arr1[i][z] + arr2[i][z];
			}
		}
		return answer;
    }
}