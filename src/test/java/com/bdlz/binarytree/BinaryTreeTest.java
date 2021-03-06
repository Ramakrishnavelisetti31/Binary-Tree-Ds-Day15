package com.bdlz.binarytree;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;

public class BinaryTreeTest {
    @Test
    public void givenThreeNumbers_WhenAddedToBST_ShouldReturnSize() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3,size);
    }

}