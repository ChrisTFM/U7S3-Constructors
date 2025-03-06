package partA;

public class PlayerTest {

    public static Player setFields(String name, double height, int yearsInLeague){
        Player newPlayer = new Player();

        newPlayer.height = height;
        newPlayer.name = name;
        newPlayer.yearsInLeague = yearsInLeague;

        return newPlayer;
    }

    public static String Player() {
        String response = "";

        /**
         * Your code goes here
         */


        return response;
    }

    public static void main(String[] args) {
        String playerOutput = Player();
        System.out.print(playerOutput);
    }
}
