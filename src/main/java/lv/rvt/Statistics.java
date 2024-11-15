package lv.rvt;

public class Statistics {
    private int count;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
    }

    public void addNumber(int number) {
        this.count ++;
    }

    public int getCount() {
        // write code here
       return this.count;
    }
    
}
