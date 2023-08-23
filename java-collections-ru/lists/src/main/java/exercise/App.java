package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String listWord, String word) {
        char[] listParameters = listWord.toLowerCase().toCharArray();
        ArrayList<Character> characterLinkedList = new ArrayList<>();
        for (Character ch : listParameters) {
            characterLinkedList.add(ch);
        }
        char[] charWord = word.toLowerCase().toCharArray();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (Character ch : charWord) {
            characterArrayList.add(ch);
        }

        if (characterLinkedList.isEmpty()) {
            return false;
        } else {
            for (Character ch : characterArrayList) {
                if (characterLinkedList.contains(ch)) {
                    characterLinkedList.remove(ch);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
//END