package kadai_026;

import java.util.Scanner;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();

        String myChoice = jyanken.getMyChoice(scanner);
        String randomChoice = jyanken.getRandomChoice();
        jyanken.playGame(myChoice, randomChoice);

        scanner.close();
    }
}
