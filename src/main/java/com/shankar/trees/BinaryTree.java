package com.shankar.trees;

public class BinaryTree {
	
	private Node root;
	
	public void insert(Node node){
		//System.out.println(node.value);
		if(root == null){
			root = node;
			return;
		}
		insertNode(root, node);
	}
	
	private void insertNode(Node parent, Node node){
		//System.out.println("parent = "+parent+" node = "+node );
		
	
		if(node.value > parent.value){
			if(parent.right == null){
				parent.right = node;
				return;
			}
			insertNode(parent.right, node);
		}
		
		if(node.value < parent.value){
			if(parent.left == null){
				parent.left = node;
				return;
			}
			insertNode(parent.left, node);
		}
	}
	
	public Node getRoot(){
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node{
	int value;
	Node left;
	Node right;
	
	public String toString(){
		return ""+value;
	}
}
