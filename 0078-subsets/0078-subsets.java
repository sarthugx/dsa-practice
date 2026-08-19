class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), nums, 0);
        return result;

    }

    private void backtrack (List<List<Integer>> result, List<Integer> tempSet, int[] nums, int start){

        result.add(new ArrayList(tempSet));

        for(int i = start; i< nums.length;i++){
            
            //case includingg the number
            tempSet.add(nums[i]);

            //Backtrack the new subset
            backtrack(result, tempSet, nums, i+1);

            //case not including the number
            tempSet.remove(tempSet.size()-1);
        }
    }
}