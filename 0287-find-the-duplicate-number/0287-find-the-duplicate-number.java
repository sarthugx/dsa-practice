class Solution {
    public int findDuplicate(int[] nums) {
        
        //NEW
        //in old solution we used a hashmap which took o(n) time comp and o(n) space comp, we can get o(1) space comp in this new solution

        int slow =0;
        int fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);


        slow =0;
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
        
        
        
        
        
        
        
        //OLD
        // HashMap<Integer, Integer> pairs = new HashMap <>();

        // for(int i =0; i<nums.length; i++){
        //     if(pairs.containsKey(nums[i])){
        //         return nums[i];
        //     }
        //     pairs.put(nums[i], i);
        // }
        // return -1;
    }
}