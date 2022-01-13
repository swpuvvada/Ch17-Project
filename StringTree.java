package com.company;

import java.util.*;

public class StringTree
{
    private StringTreeNode overallRoot;

    public StringTreeNode getOverallRoot()
    {
        return overallRoot;
    }

    public void setOverallRoot(StringTreeNode overallRoot)
    {
        this.overallRoot = overallRoot;
    }
    public StringTree()
    {
        this.overallRoot = null;
    }

    public StringTree(StringTreeNode overallRoot)
    {
        this.overallRoot = overallRoot;
    }

    public void print() {
        print(overallRoot);
        System.out.println();
    }

    private void print(StringTreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.data + " ");
            print(root.right);
        }
    }

    public void printSideways() {
        printSideways(overallRoot, "");
    }

    private void printSideways(StringTreeNode root, String indent) {
        if (root != null) {
            printSideways(root.right, indent + "    ");
            System.out.println(indent + root.data);
            printSideways(root.left, indent + "     ");
        }
    }

    public int countEmpty() {
        return countEmpty(overallRoot);
    }

    private int countEmpty (StringTreeNode root) {
        if (root == null) {
            return 1;
        } else if (root.left == null && root.right != null) {
            return 1 + countEmpty(root.right);
        } else if (root.right == null && root.left != null) {
            return 1 + countEmpty(root.left);
        } else if (root.left == null && root.right == null) {
            return 2;
        } else {
            return countEmpty(root.left) + countEmpty(root.right);
        }
    }

    public void printLevel(int n) {
        printLevel(overallRoot, n);
    }

    private void printLevel(StringTreeNode root, int n) {
        if (root != null) {
            if (n == 1) {
                System.out.println(root.data);
            } else {
                printLevel(root.left, n - 1);
                printLevel(root.right, n - 1);
            }
        }
    }
}
