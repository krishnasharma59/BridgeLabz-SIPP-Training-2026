class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int val = 1;
        for(int i = 0; i < nums.length;i++){
            if(set.contains(val)){
                val++;
            }
        }
        return val;
    }
}