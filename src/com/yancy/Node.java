package com.yancy;

public class Node {

	private Node next;	// 指针域
	private int data;	// 数据域
	
	public void setData(int value) {
		this.data = value;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	
	/**
	 * 以下是重写的构造方法
	 */
	public Node() {
		this.data = 0;
		this.next = null;
	}
	
	public Node(int data) {
		this.next = null;
		this.data = data;
	}
	
	public Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}
	
}
