class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            int second = target - nums[i];
            if (map.containsKey(second)){
                return new int[]{i, map.get(second)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No matching found for two sum");
    }
}
