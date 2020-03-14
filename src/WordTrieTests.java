import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class WordTrieTests {
    public static void main(String[] args) {
        WordTrie words = new WordTrie();
        words.insert("Hello");
        words.insert("HelL");
        words.insert("HeLp");
        words.insert("He");

        Scanner keyboard = new Scanner(System.in);
        String keyWord;
        while (true) {
            keyWord = keyboard.nextLine();
            printArray(words.search(keyWord));
            words.insert(keyWord);
            System.out.println();
            if (keyWord.equals("end")) break;
        }
        printArray(words.search("hE"));
    }

    @Test
    public void testTrieNode() {

    }

    public static void printArray(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }
    }
}
