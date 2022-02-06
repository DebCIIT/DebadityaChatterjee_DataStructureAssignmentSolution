package com.greatlearning.service;

public class Node {
	
			public Node left;
		 public   Node right;
		  public  int data;

		  public Node(int data)
		  {
			  this.data = data;
			  left = right = null;
		  }
		 	
		 public static Node newNode(int data)
		{
		    Node temp = new Node(data);
		 
		    temp.data = data;
		    temp.left = null;
		    temp.right = null;
		 
		    return temp;
		}

}
