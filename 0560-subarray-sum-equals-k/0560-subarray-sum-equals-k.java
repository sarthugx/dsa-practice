class Solution {
    public int subarraySum(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        // Base case: A prefix sum of 0 has been seen exactly 1 time (before starting)
        map.put(0, 1);
        
        int count = 0;
        int prefSum = 0;
        
        for (int i = 0; i < arr.length; ++i) {
            prefSum += arr[i];
            
            // If (prefSum - k) exists, add its frequency to our count
            if (map.containsKey(prefSum - k)) {
                count += map.get(prefSum - k); // FIXED BUG 1
            }
            
            // Keep track of how many times we've seen this prefSum
            // FIXED BUG 2: Always update frequencies, never skip!
            map.put(prefSum, map.getOrDefault(prefSum, 0) + 1);
        }
        return count;
    }
}