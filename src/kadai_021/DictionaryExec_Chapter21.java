package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("grape");
        fruits.add("orange");

        dictionary.printMeaningsFromList(fruits);
    }
}
