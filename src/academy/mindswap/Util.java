package academy.mindswap;

public class Util {

    private int min;
    private int max;

    public Util(int min, int max){
        this.min = min;
        this.max = max;
    }
    public int random(){
        return (int) (Math.random() * (this.max - this.min +1) + this.min);
    }
}
