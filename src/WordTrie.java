import java.util.ArrayList;

public class WordTrie {
    public TrieNode head;

    WordTrie() {
        head = new TrieNode();
    }

    public void insert(String word) {
        TrieNode ptr = head;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (!ptr.valExists(word.charAt(i)) && i == word.length()-1) ptr.put(word.charAt(i), true);
            else if (!ptr.valExists(word.charAt(i))) ptr.put(word.charAt(i), false);
            else if (i == word.length()-1) ptr.get(word.charAt(i)).setValid(true);

            ptr = ptr.get(word.charAt(i));

        }
    }

    public ArrayList<String> search(String subWord) {
        subWord = subWord.toLowerCase();
        TrieNode ptr = head;
        for (int i = 0; i < subWord.length(); i++) {
            if (ptr.valExists(subWord.charAt(i))) ptr = ptr.get(subWord.charAt(i));
            else return new ArrayList<>();
        }
        ArrayList<String> possibleEntries = new ArrayList<>();
        ptr.returnPossibleEntries(possibleEntries, subWord);
        return possibleEntries;
    }

}
