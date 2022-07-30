package com.BridgeLabz.Day15;

public class MyHashNode<K, V> {
				K key;
				V value;
				MyHashNode<K, V> next;
			
			public MyHashNode(K key, V value) {
				this.key = key;
				this.value = value;
				this.next = null;
			}
			
			public K getKey() {
				return key;
			}
			
			public void setKey(K key) {
				this.key = key;
			}
			
			public V getValue() {
				return value;
			}
			
			public void setValue(V value) {
				this.value = value;
			}
			
			public MyHashNode<K, V> getNext() {
				return next;
			}
			
			public void setNext(MyHashNode<K, V> next) {
				this.next = next;
			}
			
			@Override
			public String toString() {
				return "["+key+"="+ value + "]->" + next;
	}
			
}


