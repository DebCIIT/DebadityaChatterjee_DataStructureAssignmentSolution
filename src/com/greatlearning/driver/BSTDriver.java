package com.greatlearning.driver;

import com.greatlearning.service.BSTModifier;
import com.greatlearning.service.Node;

public class BSTDriver {
	
				public static void main (String[] args){
				
							
				BSTModifier tree = new BSTModifier();
			 
				tree.node = new Node(50);
				tree.node.left = new Node(30);
				tree.node.right = new Node(60);
				tree.node.left.left = new Node(10);
				tree.node.right.left= new Node(55);
				
				
				int order = 0;
				
				BSTModifier.flattenBTToSkewed(tree.node, order);
				
				BSTModifier.traverseRightSkewed(BSTModifier.headNode);
			}
}

