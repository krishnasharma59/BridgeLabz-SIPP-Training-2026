class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k +1];
        int index = 0;
        for(int i = 0; i <= nums.length-k;i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int j = 0; j < i + k; j++){
                pq.offer(nums[j]);
            }
            int max= Integer.MIN_VALUE;
            for(int num : pq){
                if(num > max){
                    max = num;
                }
            }
            ans[index++] = max;
        }
        return ans;
    }
}