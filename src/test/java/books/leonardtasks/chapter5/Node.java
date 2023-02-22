package books.leonardtasks.chapter5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Node {
    private final Map<Character, Node> children = new HashMap<>();
    private boolean word;

    Map<Character, Node> getChildren() {
        return children;
    }

    public boolean isWord() {
        return word;
    }

    public void setWord(boolean word) {
        this.word = word;
    }
}

class Trie {
    private final Node root;

    public Trie() {
        root = new Node();
    }

    // Вставка слова в префиксное дерево
    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Function function = k -> new Node();
            node = node.getChildren().computeIfAbsent(ch, function);
        }
        node.setWord(true);
    }

    // Отыскание слова в префиксном дереве
    public boolean contains(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            node = node.getChildren().get(ch);
            if (node == null) {
                return false;
            }
        }
        return node.isWord();
    }

    // Удаление слова из префиксного дерева
    public boolean delete(String word) {
        return delete(root, word, 0);
    }

    private boolean delete(Node node, String word, int position) {
        if (word.length() == position) {
            if (!node.isWord()) {
                return false;
            }
            node.setWord(false);
            return node.getChildren().isEmpty();
        }
        char ch = word.charAt(position);
        Node children = node.getChildren().get(ch);
        if (children == null) {
            return false;
        }
        boolean deleteChildren = delete(children, word, position + 1);
        if (deleteChildren && !children.isWord()) {
            node.getChildren().remove(ch);
            return node.getChildren().isEmpty();
        }
        return false;
    }
}
