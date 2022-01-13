package com.company;

public class StringTreeNode
{
    public String data;
    public StringTreeNode left;
    public StringTreeNode right;

    public StringTreeNode(String data) {
        this(data, null, null);
    }

    public StringTreeNode(String data, StringTreeNode left, StringTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
