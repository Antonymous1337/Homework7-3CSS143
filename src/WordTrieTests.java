import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class WordTrieTests {

    @Test
    public void testWordTrie() {
        WordTrie words = getWordTrie();

        assertTrue(words.search("").size() == 130);
        assertTrue(words.search("a").size() == 5);
        assertTrue(words.search("b").size() == 5);
        assertTrue(words.search("c").size() == 5);
        assertTrue(words.search("d").size() == 5);
        assertTrue(words.search("e").size() == 5);
        assertTrue(words.search("f").size() == 5);
        assertTrue(words.search("g").size() == 5);
        assertTrue(words.search("h").size() == 5);
        assertTrue(words.search("i").size() == 5);
        assertTrue(words.search("j").size() == 5);
        assertTrue(words.search("k").size() == 5);
        assertTrue(words.search("l").size() == 5);
        assertTrue(words.search("m").size() == 5);
        assertTrue(words.search("n").size() == 5);
        assertTrue(words.search("o").size() == 5);
        assertTrue(words.search("p").size() == 5);
        assertTrue(words.search("q").size() == 5);
        assertTrue(words.search("r").size() == 5);
        assertTrue(words.search("s").size() == 5);
        assertTrue(words.search("t").size() == 5);
        assertTrue(words.search("u").size() == 5);
        assertTrue(words.search("v").size() == 5);
        assertTrue(words.search("w").size() == 5);
        assertTrue(words.search("q").size() == 5);
        assertTrue(words.search("y").size() == 5);
        assertTrue(words.search("z").size() == 5);


        assertTrue(words.search("ApPlE").size() == 2);
        assertTrue(words.search("App").size() == 4);
        assertTrue(words.search("AD").size() == 1);

        assertTrue(words.search("bl").size() == 2);
        assertTrue(words.search("ba").size() == 2);
        assertTrue(words.search("bu").size() == 1);

        assertTrue(words.search("co").size() == 2);
        assertTrue(words.search("ca").size() == 1);
        assertTrue(words.search("cl").size() == 1);

        assertTrue(words.search("du").size() == 2);
        assertTrue(words.search("di").size() == 1);
        assertTrue(words.search("dr").size() == 2);

        assertTrue(words.search("ea").size() == 3);
        assertTrue(words.search("ear").size() == 2);
        assertTrue(words.search("el").size() == 2);

        assertTrue(words.search("fe").size() == 3);
        assertTrue(words.search("fan").size() == 1);
        assertTrue(words.search("fer").size() == 2);

        assertTrue(words.search("ga").size() == 2);
        assertTrue(words.search("gu").size() == 2);
        assertTrue(words.search("gr").size() == 1);

        assertTrue(words.search("he").size() == 2);
        assertTrue(words.search("ha").size() == 3);
        assertTrue(words.search("hel").size() == 2);

        assertTrue(words.search("it").size() == 2);
        assertTrue(words.search("ic").size() == 2);
        assertTrue(words.search("ill").size() == 1);

        assertTrue(words.search("jo").size() == 3);
        assertTrue(words.search("ja").size() == 2);
        assertTrue(words.search("jordon").size() == 1);

        assertTrue(words.search("ka").size() == 2);
        assertTrue(words.search("kn").size() == 1);
        assertTrue(words.search("ki").size() == 1);

        assertTrue(words.search("la").size() == 5);
        assertTrue(words.search("lam").size() == 3);
        assertTrue(words.search("law").size() == 1);

        assertTrue(words.search("may").size() == 2);
        assertTrue(words.search("mo").size() == 3);
        assertTrue(words.search("mayb").size() == 1);

        assertTrue(words.search("ne").size() == 3);
        assertTrue(words.search("ni").size() == 1);
        assertTrue(words.search("no").size() == 1);

        assertTrue(words.search("ot").size() == 2);
        assertTrue(words.search("ob").size() == 1);
        assertTrue(words.search("on").size() == 1);

        assertTrue(words.search("pu").size() == 2);
        assertTrue(words.search("po").size() == 1);
        assertTrue(words.search("pl").size() == 1);

        assertTrue(words.search("qu").size() == 5);
        assertTrue(words.search("qua").size() == 2);
        assertTrue(words.search("que").size() == 1);

        assertTrue(words.search("ro").size() == 2);
        assertTrue(words.search("ra").size() == 1);
        assertTrue(words.search("ri").size() == 2);

        assertTrue(words.search("sa").size() == 5);
        assertTrue(words.search("sat").size() == 1);
        assertTrue(words.search("sal").size() == 1);

        assertTrue(words.search("tr").size() == 2);
        assertTrue(words.search("ti").size() == 1);
        assertTrue(words.search("ta").size() == 1);

        assertTrue(words.search("ul").size() == 1);
        assertTrue(words.search("um").size() == 1);
        assertTrue(words.search("ug").size() == 1);

        assertTrue(words.search("ve").size() == 2);
        assertTrue(words.search("vo").size() == 1);
        assertTrue(words.search("va").size() == 2);

        assertTrue(words.search("wh").size() == 3);
        assertTrue(words.search("wa").size() == 2);
        assertTrue(words.search("wal").size() == 1);

        assertTrue(words.search("xe").size() == 3);
        assertTrue(words.search("xy").size() == 2);
        assertTrue(words.search("xyl").size() == 2);

        assertTrue(words.search("ya").size() == 2);
        assertTrue(words.search("ye").size() == 3);
        assertTrue(words.search("yel").size() == 2);

        assertTrue(words.search("za").size() == 2);
        assertTrue(words.search("zi").size() == 2);
        assertTrue(words.search("ze").size() == 1);

        long startTime = System.currentTimeMillis();
        printArray(words.search(""));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Searching with 130 returns and 0 char takes " + duration + " milliseconds");

        startTime = System.currentTimeMillis();
        printArray(words.search("a"));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Searching with 5 returns and 1 char takes " + duration + " milliseconds");

        startTime = System.currentTimeMillis();
        printArray(words.search("apple"));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Searching with 2 returns and 5 char takes " + duration + " milliseconds");

        startTime = System.currentTimeMillis();
        printArray(words.search("apples"));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Searching with 1 returns and 6 char takes " + duration + " milliseconds");
    }


    public WordTrie getWordTrie() {
        WordTrie words = new WordTrie();

        // inputs for EVERY letter
        words.insert("apple");
        words.insert("applesauce");
        words.insert("app");
        words.insert("application");
        words.insert("adult");

        words.insert("blueberry");
        words.insert("back");
        words.insert("blues");
        words.insert("bump");
        words.insert("barn");

        words.insert("clue");
        words.insert("cow");
        words.insert("college");
        words.insert("camps");
        words.insert("cramps");

        words.insert("dump");
        words.insert("drip");
        words.insert("drums");
        words.insert("dislike");
        words.insert("dug");

        words.insert("east");
        words.insert("earned");
        words.insert("earn");
        words.insert("Elsa");
        words.insert("elephant");

        words.insert("fence");
        words.insert("frown");
        words.insert("fan");
        words.insert("ferns");
        words.insert("Ferb");

        words.insert("gallop");
        words.insert("gulp");
        words.insert("guage");
        words.insert("gas");
        words.insert("grand");

        words.insert("hat");
        words.insert("hello");
        words.insert("happy");
        words.insert("help");
        words.insert("hack");

        words.insert("ill");
        words.insert("icky");
        words.insert("itch");
        words.insert("its");
        words.insert("ice");

        words.insert("jack");
        words.insert("jock");
        words.insert("joke");
        words.insert("jam");
        words.insert("Jordon");

        words.insert("kangaroo");
        words.insert("kelp");
        words.insert("know");
        words.insert("kids");
        words.insert("kaput");

        words.insert("lamb");
        words.insert("lamp");
        words.insert("lame");
        words.insert("lazy");
        words.insert("lawn");

        words.insert("maybe");
        words.insert("mom");
        words.insert("mayday");
        words.insert("mood");
        words.insert("mop");

        words.insert("never");
        words.insert("now");
        words.insert("niece");
        words.insert("nectar");
        words.insert("news");

        words.insert("other");
        words.insert("otter");
        words.insert("octopus");
        words.insert("obligation");
        words.insert("on");

        words.insert("put");
        words.insert("platypus");
        words.insert("pop");
        words.insert("prom");
        words.insert("pull");

        words.insert("quack");
        words.insert("queen");
        words.insert("quantum");
        words.insert("quote");
        words.insert("quiz");

        words.insert("rose");
        words.insert("rise");
        words.insert("rack");
        words.insert("rope");
        words.insert("risen");

        words.insert("sack");
        words.insert("satchel");
        words.insert("safe");
        words.insert("save");
        words.insert("salvation");

        words.insert("trap");
        words.insert("trumped");
        words.insert("tack");
        words.insert("ticktacktoe");
        words.insert("think");

        words.insert("umbrella");
        words.insert("ufo");
        words.insert("ugly");
        words.insert("ultra");
        words.insert("unanimous");

        words.insert("vector");
        words.insert("vest");
        words.insert("van");
        words.insert("volt");
        words.insert("vain");

        words.insert("wait");
        words.insert("why");
        words.insert("whale");
        words.insert("wallop");
        words.insert("who");

        words.insert("xerox");
        words.insert("xylene");
        words.insert("xylem");
        words.insert("xever");
        words.insert("xenia");

        words.insert("yearn");
        words.insert("yarn");
        words.insert("yard");
        words.insert("yelp");
        words.insert("yell");

        words.insert("zebra");
        words.insert("Zack");
        words.insert("zag");
        words.insert("zip");
        words.insert("zit");

        return words;
    }

    public static void printArray(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i) + " ");
        }
    }
}
