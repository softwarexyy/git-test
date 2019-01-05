package com.yancy;

public class LinkedList {

	Node head;	// 头节点
	
	public LinkedList () {
		this.head = new Node();
	}
	
	public LinkedList (Node head) {
		this.head = head;
	}

	public Node getHead() {
		return this.head;
	}
	
	/**
	 * 在链表尾部插入一个节点
	 * @param node
	 */
	public void addNode(Node node) {
		Node currentNode = this.head;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();	// 移动到下个节点
		}
		currentNode.setNext(node);
	}
	
	public void printAllNode() {
		Node cursor = this.head;
		while (cursor != null) {
			System.out.println("Data: " + cursor.getData());
			cursor = cursor.getNext();
		}
	}
}
