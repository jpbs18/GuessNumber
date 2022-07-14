package academy.mindswap;

public class Main {

    public static void main(String[] args) {
        Game guessTheNumber = new Game("Toni dos Pijamas", "Nelo Chapeiro", 0, 100);
        System.out.println(guessTheNumber.startGame());
    }
}
