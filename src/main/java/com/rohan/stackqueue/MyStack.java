package com.rohan.stackqueue;

public class MyStack<k> {
	MyLinkedList<k> myLinkedList;

	public MyStack() {
		myLinkedList = new MyLinkedList<k>();
	}

	/**
	 * UC 1 push method pushes new node to stack
	 * 
	 * @param node
	 * @return
	 */
	public boolean push(INode<k> node) {
		if (myLinkedList.addAtHead(node))
			return true;
		return false;
	}

	public void printStack() {
		myLinkedList.print();
	}
}
