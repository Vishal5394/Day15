package com.BridgeLabz.Day15;

import java.util.Map;
import java.util.Scanner;
	
public class HashMapRunner {
	static MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
	static Scanner sc = new Scanner(System.in);
	public void findFrequency() {
	
	String message = "To be or not to be";
	String[] messagearray = message.toLowerCase().split(" ");
	for (String word : messagearray) {
	Integer value = myHashMap.get(word);
	// System.out.println(value);
	if (value == null) {
	value = 1;
	} else {
	value++;
	}
	myHashMap.add(word, value);
	}
	System.out.println(myHashMap);
	}
	
	public static void main(String[] args) {
	
	HashMapRunner hash = new HashMapRunner();
	
	hash.findFrequency(); 
	}
	}
