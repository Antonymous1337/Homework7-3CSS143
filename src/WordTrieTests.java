import java.util.ArrayList;

public class WordTrieTests {
    public static void main(String[] args) {
        WordTrie words = new WordTrie();
        words.insert("Hello");
        words.insert("HelL");
        words.insert("HeLp");

        //printArray(wordTrie.search("hE"));
    }

    public static void printArray(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
