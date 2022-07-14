package academy.mindswap;

public class Game {

    Player player1;
    Player player2;
    private int max;
    private int min;
    Player computer;

    public Game(String player1, String player2,int min, int max){
        this.player1 = new Player(player1,min,max);
        this.player2 = new Player(player2,min,max);
        this.min = min;
        this.max = max;
        this.computer = new Player("Computer",min,max);
    }

    public String startGame(){
        return playGame();
    }

    private String playGame(){

        int computerNumber = computer.getRandom();

        int times = 0;

        while (true) {
            int p1 = player1.getRandom();
            int p2 = player2.getRandom();
            times++;

            System.out.println(player1.getName() + ": " + p1);
            System.out.println(player2.getName() + ": " + p2);
            System.out.println("Computer: " + computerNumber);

            if(p1 == p2 && p2 == computerNumber){
                computerNumber = computer.getRandom();
                continue;
            }

            if (p1 == computerNumber) {
                return player1.getName() + " wins in " + times + " rounds.";
            }
            if (p2 == computerNumber) {
                return player2.getName() + " wins in " + times + " rounds.";
            }
        }

    }
}
