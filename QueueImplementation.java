package com.datastructure.bridgelabz;

public class QueueImplementation <T extends Comparable<T>>  {

	int front, rear;
	int count, capacity;
	T[] array;
	public QueueImplementation(int size) {

		array = (T[]) new Comparable[size];
		this.front = 0;
		this.rear = -1;
		this.count = 0;
		this.capacity = size;
		
	}
	
	public void enqueue(T item) {
		
		if(isFull()) {
			System.out.println("Queue is overflowing");
			System.exit(1);
		}
		System.out.println("Inserting in the queue Account number"+item);
		rear = (rear+1);
		array[rear] = item;
		count++;
	}
	
	private boolean isFull() {
	
		return (size() == capacity);
	}

	public T peek() {

		if(isEmpty()) {
			System.out.println("Queue is underflowing");
			System.exit(1);
		}
		return array[front];
	}
	
	public int size() {
		
		return count;
		
	}
	
	public void dequeue() {
		
		if(isEmpty()) {
			System.out.println("Queue is underflowing");
			System.exit(1);
		}
		System.out.println("Removing from the Account number"+array[front]);
		front = (front+1);
		count--;
	}
	
	public boolean isEmpty() {
		
		return (size()==0);
	}
}