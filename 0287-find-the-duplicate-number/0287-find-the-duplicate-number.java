class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> pairs = new HashMap <>();

        for(int i =0; i<nums.length; i++){
            if(pairs.containsKey(nums[i])){
                return nums[i];
            }
            pairs.put(nums[i], i);
        }
        return -1;
    }
}