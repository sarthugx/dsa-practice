class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] freq = new int [nums.length+1];

        for(int i =0; i<nums.length; i++){
            freq[nums[i]]++;
        }

        int rep =0, missing = 0;
        for(int i =1; i<freq.length; i++){
            if(freq[i] == 2){
                rep = i;
            }
            if(freq[i] == 0){
                missing = i;
            }
        }

        return new int []{rep, missing};
    }
}