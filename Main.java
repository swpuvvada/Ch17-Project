package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f',
                          'g', 'h', 'i', 'j', 'k', 'l',
                          'm', 'n', 'o', 'p', 'q', 'r',
                          's', 't', 'u', 'v', 'w', 'x',
                          'y', 'z', '1', '2', '3', '4',
                          '5', '6', '7', '8', '9', '0' };

        String[] code = { ".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--..", "|" };
        userPrompt();
    }

    public static void userPrompt() {
        System.out.println("Would you like to decode or encode text? Type 'd' to decode and 'e' to encode");
        System.out.print("> ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        do {
           if (input.equals("d")) {
               System.out.println("Please type the phrase you would like decoded");
               System.out.print("> ");
               sc.nextLine();
               input = sc.nextLine();
               StringTree morseCode = createMorseTree();
               System.out.println("Your phrase decoded is: " + decode(morseCode, input));
               System.out.println("Would you like to decode or encode text? Type 'd' to decode and 'e' to encode. Type 'q' to quit");
               input = sc.next();               ;
           } else if (input.equals("e")) {
               System.out.println("Please type the phrase you would like encoded");
               System.out.print("> ");
               input = sc.nextLine();
               StringTree morseCode = createMorseTree();
               System.out.println("Would you like to decode or encode text? Type 'd' to decode and 'e' to encode. Type 'q' to quit");
               input = sc.next();
           }
        } while (!input.equals("q"));
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
        morseCode.getOverallRoot().left.left.right.right = new StringTreeNode("-");

        morseCode.getOverallRoot().right.left.left.left = new StringTreeNode("b");
        morseCode.getOverallRoot().right.left.left.right = new StringTreeNode("x");
        morseCode.getOverallRoot().right.left.right.left = new StringTreeNode("c");
        morseCode.getOverallRoot().right.left.right.right = new StringTreeNode("y");
        morseCode.getOverallRoot().right.right.left.left = new StringTreeNode("z");
        morseCode.getOverallRoot().right.right.left.right = new StringTreeNode("q");
        morseCode.getOverallRoot().right.right.right.left = new StringTreeNode("-");
        morseCode.getOverallRoot().right.right.right.right = new StringTreeNode("-");

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

    public static String decode(StringTree tree, String text) {
        // input morse output letter
        Queue<String> morse = new LinkedList<>();
        Scanner sc = new Scanner(text);
        while (sc.hasNext()) {
            morse.add(sc.next());
        }

        StringBuilder decoded = new StringBuilder();
        while (!morse.isEmpty()) {
            decoded.append(traverseTree(tree.getOverallRoot(), morse.remove()));
        }

        String decodedString = new String(decoded);
        return decodedString;

    }

    public static String traverseTree(StringTreeNode tree, String morseChar) {
        if (morseChar.length() == 1) {
            if (morseChar.equals(".")) {
                return tree.left.data;
            } else {
                return tree.right.data;
            }
        } else {
            if (morseChar.substring(0, 1).equals(".")) {
                return traverseTree(tree.left, morseChar.substring(1));
            } else {
                return traverseTree(tree.right, morseChar.substring(1));
            }
        }
    }
}
