class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> present = new HashSet<>();
        
        for(int i =0; i<nums.length; i++){
            if(present.contains(nums[i])){
                return true;
            }else{
                present.add(nums[i]);
            }
        }
        return false;
    }
}