package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        StringTree morseCode = createMorseTree();
    }

    public static StringTree createMorseTree() {
        StringTree morseCode = new StringTree();
        morseCode.setOverallRoot(new StringTreeNode(null));
        morseCode.getOverallRoot().left = new StringTreeNode("e");
        morseCode.getOverallRoot().right = new StringTreeNode("t");
        morseCode.getOverallRoot().left.left = new StringTreeNode("i");
        morseCode.getOverallRoot().left.right = new StringTreeNode("a");
        morseCode.getOverallRoot().right.left = new StringTreeNode("n");
        morseCode.getOverallRoot().right.right = new StringTreeNode("m");

        morseCode.getOverallRoot().left.left.left = new StringTreeNode("s");
        morseCode.getOverallRoot().left.left.right = new StringTreeNode("u");
        morseCode.getOverallRoot().left.right.left = new StringTreeNode("r");
        morseCode.getOverallRoot().left.right.right = new StringTreeNode("w");
        morseCode.getOverallRoot().right.left.left = new StringTreeNode("d");
        morseCode.getOverallRoot().right.left.right = new StringTreeNode("k");
        morseCode.getOverallRoot().right.right.left = new StringTreeNode("g");
        morseCode.getOverallRoot().right.right.right = new StringTreeNode("o");

        morseCode.getOverallRoot().left.left.left.left = new StringTreeNode("h");
        morseCode.getOverallRoot().left.left.left.right = new StringTreeNode("v");
        morseCode.getOverallRoot().left.left.right.left = new StringTreeNode("f");
        morseCode.getOverallRoot().left.right.left.left = new StringTreeNode("l");
        morseCode.getOverallRoot().left.right.right.left = new StringTreeNode("p");
        morseCode.getOverallRoot().left.right.right.right = new StringTreeNode("j");

        morseCode.getOverallRoot().right.left.left.left = new StringTreeNode("b");
        morseCode.getOverallRoot().right.left.left.right = new StringTreeNode("x");
        morseCode.getOverallRoot().right.left.right.left = new StringTreeNode("c");
        morseCode.getOverallRoot().right.left.right.right = new StringTreeNode("y");
        morseCode.getOverallRoot().right.right.left.left = new StringTreeNode("z");
        morseCode.getOverallRoot().right.right.left.right = new StringTreeNode("q");

        morseCode.getOverallRoot().left.right.right.right.right = new StringTreeNode("1");
        morseCode.getOverallRoot().left.left.right.right.right = new StringTreeNode("2");
        morseCode.getOverallRoot().left.left.left.right.right = new StringTreeNode("3");
        morseCode.getOverallRoot().left.left.left.left.right = new StringTreeNode("4");
        morseCode.getOverallRoot().left.left.left.left.left = new StringTreeNode("5");
        morseCode.getOverallRoot().right.left.left.left.left = new StringTreeNode("6");
        morseCode.getOverallRoot().right.right.left.left.left = new StringTreeNode("7");
        morseCode.getOverallRoot().right.right.right.left.left = new StringTreeNode("8");
        morseCode.getOverallRoot().right.right.right.right.left = new StringTreeNode("9");
        morseCode.getOverallRoot().right.right.right.right.right = new StringTreeNode("0");

        return morseCode;
    }

    public static void encode(String text) {
        // Input letter  output morse
        //
    }

    public static void decode(StringTree tree, String text) {
        // input morse output letter
        Queue<String> morse = new LinkedList<>();
        Scanner sc = new Scanner(text);
        while (sc.hasNext()) {
            morse.add(sc.next());
        }

        StringBuilder decoded = new StringBuilder();

    }

    public static void traverseTree(StringTree tree, String morseChar) {

    }
}
