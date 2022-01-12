package com.company;

public class Main {

    public static void main(String[] args) {
	StringTree morseCode = createMorseTree();
    }
	
    public static StringTree createMorseTree() {
	StringTree morseCode = new StringTree();
	morseCode.setOverallRoot(new StringTreeNode(null));
	morseCode.getOverallRoot().left = "e";
	morseCode.getOverallRoot().right = "t";
	morseCode.getOverallRoot().left.left = "i";
	morseCode.getOverallRoot().left.right = "a";
	morseCode.getOverallRoot().right.left = "n";
	morseCode.getOverallRoot().right.right = "m";  
	    
	morseCode.getOverallRoot().left.left.left = "s";
	morseCode.getOverallRoot().left.left.right = "u";
	morseCode.getOverallRoot().left.right.left = "r";
	morseCode.getOverallRoot().left.right.right = "w";  
	morseCode.getOverallRoot().right.left.left = "d";
	morseCode.getOverallRoot().right.left.right = "k";
	morseCode.getOverallRoot().right.right.left = "g";
	morseCode.getOverallRoot().right.right.right = "o";      
	
	morseCode.getOverallRoot().left.left.left.left = "h";
	morseCode.getOverallRoot().left.left.left.right = "v";
	morseCode.getOverallRoot().left.left.right.left = "f";
	morseCode.getOverallRoot().left.right.left.left = "l";
	morseCode.getOverallRoot().left.right.right.left = "p";
	morseCode.getOverallRoot().left.right.right.right = "j";  
	    
	morseCode.getOverallRoot().right.left.left.left = "b";
	morseCode.getOverallRoot().right.left.left.right = "x";
	morseCode.getOverallRoot().right.left.right.left = "c";
	morseCode.getOverallRoot().right.left.right.right = "y";  
	morseCode.getOverallRoot().right.right.left.left = "z";
	morseCode.getOverallRoot().right.right.left.right = "q";
	    
	morseCode.getOverallRoot().left.right.right.right.right = "1";
	morseCode.getOverallRoot().left.left.right.right.right = "2";
	morseCode.getOverallRoot().left.left.left.right.right = "3";
	morseCode.getOverallRoot().left.left.left.left.right = "4";  
	morseCode.getOverallRoot().left.left.left.left.left = "5";
	morseCode.getOverallRoot().right.left.left.left.left = "6";
	morseCode.getOverallRoot().right.right.left.left.left = "7";
	morseCode.getOverallRoot().right.right.right.left.left = "8";
	morseCode.getOverallRoot().right.right.right.right.left = "9";
	morseCode.getOverallRoot().right.right.right.right.right = "0";
	    
	return morseCode;
    }	    
	
    public static void encode(String text) {
	  // Input letter  output morse
	    // 
    }
	
    public static void decode(StringTree tree, String text) {
	    // input morse output letter
	LinkedList<String> morse = new Queue<>();
	Scanner sc = new Scanner(text);
	while (sc.hasNext()) {
		morse.add(sc.next());
	}
	    
	StringBuilder decoded = new StringBuilder();
	
    }
	
    public static void traverseTree(StringTree tree, String morseChar) {
	    
    }	    
}
