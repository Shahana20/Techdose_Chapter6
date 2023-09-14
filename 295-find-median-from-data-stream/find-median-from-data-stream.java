class MedianFinder {
    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;
    boolean even;
    public MedianFinder() {
        max = new PriorityQueue<>(Collections.reverseOrder());
        min = new PriorityQueue<>();
        even = false;
    }
    
    public void addNum(int num) {
        if(even){
            max.offer(num);
            min.offer(max.poll());
        }else{
            min.offer(num);
            max.offer(min.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if(!even){return (max.peek() + min.peek())/2.0;}
        else {return max.peek();}
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */