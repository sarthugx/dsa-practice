class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map <Integer, Boolean> explored = new HashMap<>();

        for(int num : nums){
            explored.put(num, false);
        }

        for (int num : nums){
            int currentLength =1;

            int nextNum = num+1;
            while(explored.containsKey(nextNum) && explored.get(nextNum) == false){
                currentLength ++;
                explored.put(nextNum, true);

                nextNum++;
            }

            int prevNum = num -1;
            while(explored.containsKey(prevNum) && explored.get(prevNum) == false){
                currentLength ++;
                explored.put(prevNum, true);

                prevNum--;
            }

            longestLength = Math.max(currentLength, longestLength);
        }

        return longestLength;

    }
}