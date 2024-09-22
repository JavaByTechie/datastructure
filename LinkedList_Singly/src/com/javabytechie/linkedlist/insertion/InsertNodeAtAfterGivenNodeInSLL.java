package com.javabytechie.linkedlist.insertion;

import com.javabytechie.linkedlist.Node;

// Java Program to Insert a Node after a Given Node in Linked List

public class InsertNodeAtAfterGivenNodeInSLL {
	// Method to insert a new Node after a given Node
	static Node insertAfter(Node head, int key, int new_date) {
		Node node = head;

		// Iterate a list and find out the key
		while (node != null) {
			if (node.data == key)
				break;
			node = node.next;
		}

		// if node becomes null means, given key is not
		// found in linked list
		if (node == null)
			return head;

		// Create a new node with the given data and point
		// the next of newNode to node's next &
		// point current next to newNode
		Node newNode = new Node(new_date);
		newNode.next = node.next;
		node.next = newNode;
		return head;
	}

	static void printLinkedList(Node Node) {
		while (Node != null) {
			System.out.print(Node.data + " ");
			Node = Node.next;
		}
		System.out.println();      // New Line
	}

	public static void main(String[] args) {
		// Creates nodes
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(40);
		head.next.next.next = new Node(50);

		System.out.println("Linked List data: ");
		printLinkedList(head);

		int key = 20, new_date = 30;

		// Insert a new node 30, after the node 20
		head = insertAfter(head, key, new_date);

		System.out.println("After insertion, Linked List data: ");
		printLinkedList(head);
	}
}