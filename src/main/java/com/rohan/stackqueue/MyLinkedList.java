package com.rohan.stackqueue;

public class MyLinkedList<k> {
	public INode<k> head;
	public INode<k> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	/**
	 * adding node at front
	 * 
	 * @param newNode
	 */
	public boolean addAtHead(INode<k> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			newNode.setNext(head);
			head = newNode;
		}
		return true;
	}

	/**
	 * adding node at back
	 * 
	 * @param newNode
	 */
	public boolean addAtTail(INode<k> newNode) {
		if (head == null)
			head = newNode;
		if (tail == null)
			tail = newNode;
		else {
			tail.setNext(newNode);
			tail = newNode;
		}
		return true;
	}

	/**
	 * popping first node
	 * 
	 * @return
	 */
	public INode<k> pop() {
		INode<k> poppedNode = head;
		head = head.getNext();
		return poppedNode;
	}

	/**
	 * popping last node
	 * 
	 * @return
	 */
	public INode<k> popLast() {
		INode<k> tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}

		tail = tempNode;
		tempNode = tempNode.getNext();
		tail.setNext(null);
		return tempNode;
	}

	public int size() {
		INode<k> temp = head;
		int size = 0;
		while (temp.getNext() != null) {
			size++;
			temp = temp.getNext();
		}
		return size + 1;
	}

	public void print() {
		INode<k> temp = head;
		while (temp.getNext() != null) {
			System.out.print(temp.getKey() + "->");
			temp = temp.getNext();
		}
		System.out.print(temp.getKey());
		System.out.println();
	}

}
