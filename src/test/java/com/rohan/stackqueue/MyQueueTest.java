package com.rohan.stackqueue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyQueueTest {

	@Test
	public void whenEnqueueCalled_shouldReturn_true() {
		MyNode<Integer> first = new MyNode<Integer>(56);
		MyNode<Integer> second = new MyNode<Integer>(30);
		MyNode<Integer> third = new MyNode<Integer>(70);
		MyQueue<Integer> myQueue = new MyQueue<>();
		assertTrue(myQueue.enqueue(first));
		assertTrue(myQueue.enqueue(second));
		assertTrue(myQueue.enqueue(third));
		System.out.println("Current queue is : ");
		myQueue.printQueue();
	}

}
