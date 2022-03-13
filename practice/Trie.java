import java.util.*;

public class Trie {

    private class TrieNode {
        private HashMap<Character, TrieNode> children = new HashMap<>();
        private boolean endOfWord;

        Map<Character, TrieNode> getChildren() {
            return children;
        }

        boolean isEndOfWord() {
            return endOfWord;
        }

        void setEndOfWord(boolean endOfWord) {
            this.endOfWord = endOfWord;
        }
    }

    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String word) {
        TrieNode current = root;

        for (char l : word.toCharArray()) {
            current = current.getChildren().computeIfAbsent(l, c -> new TrieNode());
        }
        current.setEndOfWord(true);
    }

    boolean delete(String word) {
        return delete(root, word, 0);
    }

    boolean containsNode(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.getChildren().get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.isEndOfWord();
    }

    boolean isEmpty() {
        return root == null;
    }

    private boolean delete(TrieNode current, String word, int index) {
        if (index == word.length()) {
            if (!current.isEndOfWord()) {
                return false;
            }
            current.setEndOfWord(false);
            return current.getChildren().isEmpty();
        }
        char ch = word.charAt(index);
        TrieNode node = current.getChildren().get(ch);
        if (node == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(node, word, index + 1) && !node.isEndOfWord();

        if (shouldDeleteCurrentNode) {
            current.getChildren().remove(ch);
            return current.getChildren().isEmpty();
        }
        return false;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("word");
        trie.insert("Avinash");
        trie.insert("Avin");
        System.out.println(trie.containsNode("word"));
    }
}