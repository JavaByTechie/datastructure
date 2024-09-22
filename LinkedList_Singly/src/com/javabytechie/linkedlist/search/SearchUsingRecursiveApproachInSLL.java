package com.javabytechie.linkedlist.search;

// Java program to search a key in a linked list using Iterative approach

import com.javabytechie.linkedlist.Node;

public class SearchUsingRecursiveApproachInSLL {
	// Checks whether the key is present in linked list
	static boolean searchKey(Node head, int key) {

		// If head is equal to null that means list is empty
		if (head == null)
			return false;

		// If key is present in the current node
		if (head.data == key)
			return true;

		// Recur for remaining list
		return searchKey(head.next, key);
	}

	public static void main(String[] args) {

		// Create a linked list
		Node head = new Node(50);
		head.next = new Node(30);
		head.next.next = new Node(10);
		head.next.next.next = new Node(70);
		head.next.next.next.next = new Node(40);

		// Linked list will be created like this
		// 50 -> 30 -> 10 -> 70 -> 40

		// Scenario: Key is present
		if (searchKey(head, 70))
			System.out.println("Key 70 is PRESENT in the list.");
		else
			System.out.println("Key 70 is NOT PRESENT in the list.");

		// Scenario: Key is not present
		if (searchKey(head, 5))
			System.out.println("Key 5 is PRESENT in the list.");
		else
			System.out.println("Key 5 is NOT PRESENT in the list.");
	}
}
