import java.util.Scanner;
// import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        
        // Instansiasi Monopoly
        Monopoly monopoly = new Monopoly();

        // set player
        monopoly.set_player();

        // bermain
        for(;;) {

            if(monopoly.player1.getStatusPlayer()) {
                monopoly.bermain(monopoly.player1, monopoly);
            }
            if(monopoly.player2.getStatusPlayer()) {
                monopoly.bermain(monopoly.player2, monopoly);
            }
            if(monopoly.player3.getStatusPlayer()) {
                monopoly.bermain(monopoly.player3, monopoly);
            }
            if(monopoly.player4.getStatusPlayer()) {
                monopoly.bermain(monopoly.player4, monopoly);
            }

        }

    }

}