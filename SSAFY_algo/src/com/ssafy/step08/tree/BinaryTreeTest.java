package com.ssafy.step08.tree;

public class BinaryTreeTest {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree(10);
		for (int i = 0; i < 10; i++) {
			tree.add((char) ('A' + 1));
		}
		tree.searchBFS();
		tree.searchPreOrder(3);
		System.out.println();
		tree.searchInOrder(1);
		tree.searchPostOrder(1);
	}

}
