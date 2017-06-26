package com.shankar.trees;

import java.util.Arrays;

public class DFS {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		
		Arrays.stream(new int[]{8, 5, 4, 13, 9, 15, 1}).map(x -> {Node n = new Node(); n.value = x; bt.insert(n);return x;}).count(); 
		
		//System.out.println(bt.getRoot());
		
		dfs(bt);

	}
	
	public static void dfs(BinaryTree bt){
		printNodeDFS(bt.getRoot(), 0);
		
	}
	
	private static void printNodeDFS(Node node, int level){
		
		if(node == null){
			return;
		}
		
		System.out.println(node.value +" level "+level);
		++level;
		printNodeDFS(node.left, level);
		printNodeDFS(node.right, level);
	}

}
