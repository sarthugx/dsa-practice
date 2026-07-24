class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);
        //using set so same same pairs will not be at the end
        Set <List<Integer>
        > set = new HashSet<>();

        for(int i = 0; i < nums.length -2; i++){
            int left = i+1;
            int right = nums.length -1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left ++;
                    right --;
                } else if(sum < 0){
                    left ++;
                }else{
                    right --;
                }
            }
        }

        return new ArrayList<>(set);
    }
}


//[1 2 3 4 5 6]
//so what we are gonna do is we will just have a for loop going which will fix one element at a time
//after fixing one ele we will find remaing two using left and right, using same method as two sum
//