// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class RockPaperScissors {
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    int randomnumber = random.nextInt(3) + 1;
    String statuspc = null;
    String statusplayer = null;
    int inputnum = 0;
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void showmenu() {
        System.out.println("------------------------------------------------------");
        System.out.println("....Lets play the Game....");
        System.out.println("Press '1' for Rock");
        System.out.println("Press '2' for Paper");
        System.out.println("Press '3' for Scissor");
        System.out.println("--------------------------");
    }

    public int getinput() {
        System.out.print("Enter Your Move :");
        inputnum = scan.nextInt();
        System.out.println(2);
        return inputnum;
    }

    public void gameshow() {
        System.out.println("PC     : " + statuspc);
        System.out.println("Player :" + statusplayer);
    }

    public void gameresults() {
        if (randomnumber == 1 && inputnum == 2) {
            System.out.println("Player Won!!!");
        } else if (randomnumber == 1 && inputnum == 3) {
            System.out.println("PC Won!!!");
        } else if (randomnumber == 2 && inputnum == 3) {
            System.out.println("Player Won!!!");
        } else if (randomnumber == 2 && inputnum == 1) {
            System.out.println("Player Won!!!");
        } else if (randomnumber == 3 && inputnum == 2) {
            System.out.println("Pc Won!!!");
        } else if (randomnumber == 3 && inputnum == 1) {
            System.out.println("Pc Won!!!");
        } else if (randomnumber == inputnum) {
            System.out.println("Tied!!!");
        } else {
            System.out.println("WrongInput");
        }
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------");
    }

    public void setStatusforpc() {
        if (randomnumber == 1) {
            this.statuspc = "Rock";
        } else if (randomnumber == 2) {
            this.statuspc = "Paper";
        } else {
            this.statuspc = "Scissors";
        }
    }

    public void setStatusforplayer() {
        if (inputnum == 1) {
            this.statusplayer = "Rock";
        } else if (inputnum == 2) {
            this.statusplayer = "Paper";
        } else {
            this.statusplayer = "Scissors";
        }
    }


    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            RockPaperScissors game1 = new RockPaperScissors();
            game1.showmenu();
            game1.getinput();
            game1.setStatusforpc();
            game1.setStatusforplayer();
            game1.gameshow();
            game1.gameresults();
            scan.nextLine();
            game1.clearScreen();
        }
    }
}