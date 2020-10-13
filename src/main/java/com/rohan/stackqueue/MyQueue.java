package com.rohan.stackqueue;

public class MyQueue<k> {
	MyLinkedList<k> myLinkedList;

	public MyQueue() {
		myLinkedList = new MyLinkedList<k>();
	}

	/**
	 * UC 1 enqueue method will add node to back of queue
	 * 
	 * @param node
	 * @return
	 */
	public boolean enqueue(INode<k> node) {
		return myLinkedList.addAtTail(node);
	}

	public void printQueue() {
		myLinkedList.print();
	}
}
