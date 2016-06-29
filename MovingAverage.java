public class MovingAverage {
    int windowsize = 0;
    List<Integer> list;
    double sum = 0;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        windowsize = size;
        list = new ArrayList<Integer>();
    }
    
    public double next(int val) {
        if(list.size() < windowsize){
            list.add(val);
            sum += val;
        }else{
            int item = list.remove(0);
            sum -= item;
            sum += val;
            list.add(val);
        }
        if(list.size() > 0)
            return (double)sum/(double)list.size();
        return 0.0;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
