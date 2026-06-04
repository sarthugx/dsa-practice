class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap <Integer, Integer> pairs = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            if(pairs.containsKey(num)){
                if(Math.abs(pairs.get(num)-i)<=k){
                    return true;
                }
            }

            pairs.put(num, i);
        }
        return false;

    }
}