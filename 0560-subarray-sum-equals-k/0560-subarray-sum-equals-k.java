class Solution {
    public int subarraySum(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int prefSum = 0;

        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {

            prefSum += arr[i];

            if (map.containsKey(prefSum - k)) {
                count += map.get(prefSum - k);
            }

            if (map.containsKey(prefSum)) {
                map.put(prefSum, map.get(prefSum) + 1);
            } else {
                map.put(prefSum, 1);
            }
        }

        return count;
    }
}