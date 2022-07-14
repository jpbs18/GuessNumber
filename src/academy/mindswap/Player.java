package academy.mindswap;

public class Player {
    private String name;
    private Util util;

    public Player(String name, int min, int max){
        this.name = name;
        this.util = new Util(min, max);
    }

    public String getName(){
        return this.name;
    }

    public int getRandom(){
        return util.random();
    }

}
