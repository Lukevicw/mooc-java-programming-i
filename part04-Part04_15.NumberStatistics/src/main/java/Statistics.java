
public class Statistics {
    private int count;
    //private int number;
    private int sum;
    
    public Statistics() {
        //this.number = number;
        this.count = count;
        this.sum = sum;
    }
    
    
    public void addNumber(int number) {
        //this.sum = this.sum + number;
        count++;
        this.sum += number;
    
    }    
    public int getCount() {
        if (this.count != 0 && this.sum != 0) {
            return this.count;
        }
        return 0;
    
    }
    
    public int sum() {
        if (this.sum !=0 && this.count !=0) {
            return sum;
        }
        return 0;
    }
    
    public double average() {
        if (this.sum != 0 && this.count !=0) {
            return 1.0 * this.sum / this.count;
        }
        return 0.0;
    }
}
