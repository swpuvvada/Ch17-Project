package com.company;

public class StringTreeNode
{
    public String data;
    public IntTreeNode left;
    public IntTreeNode right;

    public IntTreeNode(String data) {
        this(data, null, null);
    }

    public IntTreeNode(String data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
