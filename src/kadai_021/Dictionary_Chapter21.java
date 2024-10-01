package kadai_021;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String,String> dictionary;

    public Dictionary_Chapter21() {
        this.dictionary = new HashMap<String,String>();

        this.dictionary.put("apple", "りんご");
        this.dictionary.put("peach", "桃");
        this.dictionary.put("banana", "バナナ");
        this.dictionary.put("lemon", "レモン");
        this.dictionary.put("pear", "梨");
        this.dictionary.put("kiwi", "キウィ");
        this.dictionary.put("strawberry", "いちご");
        this.dictionary.put("grape", "ぶどう");
        this.dictionary.put("muscat", "マスカット");
        this.dictionary.put("cherry", "さくらんぼ");
    }

    public void printMeaningsFromList(ArrayList<String> keys) {
        for (String key : keys) {
            if (!this.dictionary.containsKey(key)) {
                System.out.println(key + "は辞書に存在しません");
                continue;
            }
            System.out.println(key + "の意味は" + this.dictionary.get(key));
        }
    }
}
