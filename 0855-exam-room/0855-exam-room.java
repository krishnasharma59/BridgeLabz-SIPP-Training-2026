class ExamRoom {

    class Interval {
        int l, r, d;
        
        Interval(int l, int r) {
            this.l = l;
            this.r = r;
            this.d = dist(l, r);
        }
    }

    int n;
    PriorityQueue<Interval> pq;

    public ExamRoom(int n) {
        this.n = n;

        pq = new PriorityQueue<>((a, b) -> {
            if(a.d != b.d) return b.d - a.d;
            return a.l - b.l;
        });

        pq.offer(new Interval(-1, n));
    }
    
    private int dist(int l, int r) {
        if(l == -1) return r;
        if(r == n) return n - 1 - l;
        return (r - l) / 2;
    }

    public int seat() {
        
        Interval curr = pq.poll();

        int pos;
        if(curr.l == -1) pos = 0;
        else if(curr.r == n) pos = n - 1;
        else pos = (curr.l + curr.r) / 2;

        pq.offer(new Interval(curr.l, pos));
        pq.offer(new Interval(pos, curr.r));

        return pos;
    }
    
    public void leave(int p) {
        
        Interval left = null, right = null;

        for(Interval in : pq) {
            if(in.r == p) left = in;
            if(in.l == p) right = in;
            if(left != null && right != null) break;
        }

        pq.remove(left);
        pq.remove(right);

        pq.offer(new Interval(left.l, right.r));
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(n);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */