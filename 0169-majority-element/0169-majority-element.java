class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // int ME =0;
        int count=0;
        int candidate =0;

        for(int i =0; i<n; i++){

            if(count == 0){
                candidate = nums[i];
            }

            if(nums[i] == candidate){
                count ++;
            }else{
                count--;
            }
        }

        count =0;
        for(int j = 0; j<n; j++){
            if(nums[j] == candidate){
                count ++;
            }
        }
        if(count >= n/2){
            return candidate;
        }

        return -1;
    }
}