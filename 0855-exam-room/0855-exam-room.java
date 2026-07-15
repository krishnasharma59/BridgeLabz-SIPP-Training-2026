class ExamRoom {
    
    TreeSet<Integer> set;
    int n;

    public ExamRoom(int n) {
        set = new TreeSet<>();
        this.n = n-1;
    }
    
    public int seat() {
        if (set.size() == 0) {
            set.add(0);
            return 0;
        }
        
        int left = set.first();
        int diff = left;
        int max = 0;
        
        int mid;

        for (Integer right : set) {
            if (right == left) continue;
            mid = left + (right-left)/2;
            if (diff < Math.min(mid-left, right-mid) && !set.contains(mid)) {
                diff = Math.min(mid-left, right-mid);
                max = mid;
            }
            left = right;
        }

        int last = set.last();
        if (n-last > diff) max = n;
        
        set.add(max);
        return max;
    }
    
    public void leave(int p) {
        set.remove(p);
    }
}