class MinStack {
    Deque<Integer> st;
    PriorityQueue<Integer> minHeap;

    public MinStack() {
        st = new ArrayDeque<>();
        minHeap = new PriorityQueue<>();
    }
    
    public void push(int val) {
        st.push(val);
        minHeap.add(val);
    }
    
    public void pop() {
        int val = st.poll();
        minHeap.remove(val);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minHeap.peek();
    }
}
