package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordDict = new HashMap<>();
        List<String> wordList = new ArrayList<>();
        if (sentence.equals("")) {
            return new HashMap<>();
        }
        String[] words = sentence.split(" ");
        for (String word : words) {
            wordList.add(word);
        }
        for (int i = 0; i < wordList.size(); i++) {
            String tempWord = wordList.get(i);

            if (!wordDict.containsKey(tempWord)) {
                wordDict.put(tempWord, 1);
            } else {
                wordDict.put(tempWord, wordDict.get(tempWord) + 1);
            }

        }
        return wordDict;
    }

    public static String toString(Map<String, Integer> wordDict) {
        StringBuilder answer = new StringBuilder("{");
        if (wordDict.isEmpty()) {
            return "{}";
        }
        for (String key : wordDict.keySet()) {
            answer.append("\n");
            answer.append("  " + key + ": " + wordDict.get(key));
        }
        answer.append("\n");
        answer.append("}");
        return answer.toString();
    }
}
//END
