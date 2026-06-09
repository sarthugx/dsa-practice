class Solution {
    public int[] findMissingAndRepeatedValues(int[][] nums) {
        int n = nums.length;
        int total_length = n*n; 
        int [] freq = new int [total_length+1];

        for(int i =0; i<nums.length; i++){
            for(int j =0; j<nums[0].length; j++){
                freq[nums[i][j]]++;
            }
        }

        int rep =0, missing = 0;
        for(int i =1; i<=total_length; i++){
            if(freq[i] == 2){
                rep = i;
            }

            if(freq[i] == 0){
                missing = i;
            }        
        }

        return new int[]{rep, missing};
    }
}