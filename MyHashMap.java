package com.BridgeLabz.Day15;


import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;

public class MyHashMap<K, V> {
			MyHashNode head;
			MyHashNode tail;
			int size;
			private final int numOfBuckets;
			ArrayList<MyHashNode<K, V>> sizeOfBucket;
		
			public MyHashMap() {
			this.numOfBuckets = 20;
			sizeOfBucket = new ArrayList<>();
			for (int i = 0; i < numOfBuckets; i++) {
			sizeOfBucket.add(null);
			}
			}
			
			public void add(K key, V value) {
			int index = getKeyIndex(key);
			MyHashNode<K, V> node = sizeOfBucket.get(index);
			if (node == null) {
			node = new MyHashNode<>(key, value);
			sizeOfBucket.set(index, node);
			}
			node = searchNode(key);
			if (node == null) {
			node = new MyHashNode<>(key, value);
			append(node);
			
			} else {
			node.setValue(value);
			}
			}
			
			/*
			* appending Key value at last
			*/
			private void append(MyHashNode<K, V> node) {
			if (head == null) {
			head = node;
			}
			if (tail == null) {
			tail = node;
			} else {
			tail.setNext(node);
			tail = node;
			}
			
			}
			/*
			* Get the values by using key index
			*/
			public V get(K key) {
			int index = getKeyIndex(key);
			MyHashNode<K, V> head = sizeOfBucket.get(index);
			while (head != null) {
			if (head.key.equals(key)) {
			return head.value;
			}
			head = head.next;
			}
			return null;
			}
			/*
			* Serching the node using keys
			*/
			public MyHashNode<K, V> searchNode(K key) {
			MyHashNode node = head;
			int countposition = 0;
			while (node != null) {
			countposition++;
			if (node.getKey().equals(key)) {
			return node;
			}
			node = node.getNext();
			}
			return node;
			}
			/*
			* Get the values by using index using hashcode() method
			*/
			public int getKeyIndex(K word) {
			// System.out.println(word);
			int hashcode = Math.abs(word.hashCode());
			// System.out.println(hashcode);
			int index = hashcode % numOfBuckets; // fixing the index for one word
			
			return index;
			
			}
			/*
			* Removing the value
			*/
			public void remove(K word) {
			MyHashNode currentNode = head;
			MyHashNode previousNode = null;
			while (currentNode != null && currentNode.getKey().equals(word)) {
			head = currentNode.getNext();
			return;
			}
			while (currentNode != null && !(currentNode.getKey().equals(word))) {
			previousNode = currentNode;
			currentNode = currentNode.getNext();
			}
			if (currentNode != null) {
			previousNode.next = currentNode.next;
			}
			}
			
			public String toString() {
			return "Mylist{" + head + "}";
			}
			}
			
			
