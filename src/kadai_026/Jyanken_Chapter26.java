package kadai_026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
    private ArrayList<String> jyankenList = new ArrayList<>();
    private HashMap<String, String> jyankenMap = new HashMap<>();

    public Jyanken_Chapter26() {
        this.jyankenList.add("r"); // グー（rock）
        this.jyankenList.add("s"); // チョキ（scissors）
        this.jyankenList.add("p"); // パー（paper）
        this.jyankenMap.put("r", "グー"); // グー（rock）
        this.jyankenMap.put("s", "チョキ"); // チョキ（scissors）
        this.jyankenMap.put("p", "パー"); // パー（paper）
    }

    public String getMyChoice(Scanner scanner) {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String input = scanner.next();

        boolean isValid = input.equals("r") || input.equals("s") || input.equals("p");

        if(!isValid) {
            System.out.println("入力値が不正です");
            return getMyChoice(scanner);
        }

        return input;
    }

    public String getRandomChoice() {
        int random = (int) (Math.floor((Math.random() * 3)));
        return this.jyankenList.get(random);
    }

    public void playGame(String myChoice, String randomChoice) {
        System.out.println("自分の手は" + this.jyankenMap.get(myChoice) + ",対対戦相手の手は" + this.jyankenMap.get(randomChoice));

        if(myChoice.equals(randomChoice)) {
            System.out.println("あいこです");
        } else if(myChoice.equals("r") && randomChoice.equals("s") || myChoice.equals("s") && randomChoice.equals("p") || myChoice.equals("p") && randomChoice.equals("r")) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
