import java.util.ArrayList;

public class TrieNode {
    char val;
    TrieNode[] nodes;
    boolean word;

    TrieNode() { // 26 letters
        nodes = new TrieNode[26];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = null;
        }
        word = false;
    }

    TrieNode(char v, boolean word) {
        val = Character.toLowerCase(v);
        nodes = new TrieNode[26];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = null;
        }
        this.word = word;
    }

    public boolean valExists(char v) {
        return nodes[findNumEquivalentToChar(Character.toLowerCase(v))] != null;
    }

    public void setValid(boolean validity) {
        word = validity;
    }

    public void put(char v, boolean word) {
        if (!valExists(v)){
            nodes[findNumEquivalentToChar(Character.toLowerCase(v))] = new TrieNode(v, word);
        }
    }

    public TrieNode get(char v) {
        return nodes[findNumEquivalentToChar(Character.toLowerCase(v))];
    }

    public void returnPossibleEntries(ArrayList<String> toReturn, String subWord) {
        if (word) toReturn.add(subWord);
        for (int i = 0; i < nodes.length; i++) {
            // if (vals != new TrieNode()) returnPossibleEntries(toReturn, subWord + val);
            if (nodes[i] != null) nodes[i].returnPossibleEntriesHelper(toReturn, subWord);
        }
    }

    public void returnPossibleEntriesHelper(ArrayList<String> toReturn, String subWord) {
        if (word) toReturn.add(subWord+val);
        for (int i = 0; i < nodes.length; i++) {
            // if (vals != new TrieNode()) returnPossibleEntries(toReturn, subWord + val);
            if (nodes[i] != null) nodes[i].returnPossibleEntriesHelper(toReturn, subWord + val);
        }
    }

    private int findNumEquivalentToChar(char v) {
        switch (v) {
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
            case 'd':
                return 3;
            case 'e':
                return 4;
            case 'f':
                return 5;
            case 'g':
                return 6;
            case 'h':
                return 7;
            case 'i':
                return 8;
            case 'j':
                return 9;
            case 'k':
                return 10;
            case 'l':
                return 11;
            case 'm':
                return 12;
            case 'n':
                return 13;
            case 'o':
                return 14;
            case 'p':
                return 15;
            case 'q':
                return 16;
            case 'r':
                return 17;
            case 's':
                return 18;
            case 't':
                return 19;
            case 'u':
                return 20;
            case 'v':
                return 21;
            case 'w':
                return 22;
            case 'x':
                return 23;
            case 'y':
                return 24;
            case 'z':
                return 25;
            default:
                return 26;
        }
    }
}