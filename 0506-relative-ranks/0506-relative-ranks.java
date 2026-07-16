class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< n; i++){
            pq.offer(score[i]);
            map.put(score[i],i);
        }
        int rank = 1;

        while (!pq.isEmpty()) {
            int currScore = pq.poll();
            int index = map.get(currScore);

            if (rank == 1) {
                answer[index] = "Gold Medal";
            } else if (rank == 2) {
                answer[index] = "Silver Medal";
            } else if (rank == 3) {
                answer[index] = "Bronze Medal";
            } else {
                answer[index] = String.valueOf(rank);
            }

            rank++;
        }

        return answer;

    }
}