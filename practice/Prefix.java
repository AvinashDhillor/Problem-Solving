import java.util.*;
import java.util.Collections;
import java.util.List;

public class Prefix {
    static class Trie {
        private static final int CHAR_SIZE = 26;

        private boolean isLeaf;
        private List<Trie> children = null;
        private int word_passing = 0;
        private int word_ending = 0;

        Trie() {
            isLeaf = false;
            children = new ArrayList<>(Collections.nCopies(CHAR_SIZE, null));
        }

        public void insert(String key) {
            Trie curr = this;
            for (char c : key.toCharArray()) {
                if (curr.children.get(c - 'a') == null) {
                    // System.out.println(c + " Entring null ");
                    curr.children.set(c - 'a', new Trie());
                }
                curr.children.get(c - 'a').word_passing++;
                // System.out.println(c + " Coming here " + curr.children.get(c -
                // 'a').word_passing);
                curr = curr.children.get(c - 'a');
            }

            curr.word_passing--;
            curr.isLeaf = true;
        }

        public int search(String key) {
            // System.out.print("Searching \"" + key + "\" : ");
            Trie curr = this;
            for (char c : key.toCharArray()) {
                curr = curr.children.get(c - 'a');
                // System.out.println(curr.word_passing);
                if (curr == null)
                    return 0;
            }
            return curr.word_passing;
        }
    }

    public static void main(String args[]) {
        String[] name = { "jackson", "jacques", "jack" };
        String[] prefix = { "jack" };

        Trie head = new Trie();
        // root = new TrieNode();

        for (String i : name) {
            head.insert(i);
        }

        int[] sol_arr = new int[prefix.length];
        int index = 0;
        for (String i : prefix) {
            sol_arr[index++] = head.search(i);
        }

        for (int i : sol_arr) {
            System.out.println(i);
        }

    }
}