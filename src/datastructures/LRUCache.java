package datastructures;

import java.util.HashMap;
import java.util.Iterator;

public class LRUCache {
	
	Node head;
	Node tail;
	HashMap<Integer, Node> lruCache = null;
	int cap =0;
	
	public LRUCache(int capacity) {
		this.cap = capacity;
        this.lruCache = new HashMap<>();
	}
	
	public static void main(String[] args) {
		LRUCache myCache = new LRUCache(5);
		String query = "SET 1 2 GET 1";
		String words[] = query.split(" ");
		for (int i=0 ; i< words.length;i++) {
			if (words[i] == "SET")
				myCache.set(Integer.valueOf(words[i+1]),Integer.valueOf(words[i+2]));
			if (words[i] == "GET")
				myCache.get(Integer.valueOf(words[i+1]));
		}
		}

	private void get(int key) {
		
	}

	private void set(int key, int value) {
		Node temp = new Node(key, value);
		
		if (head == null && tail == null) {
			head = temp;
			tail = temp;
		}
		
	}
	public void displayCache (LRUCache cache) {
		cache.lruCache.forEach((k,v)->System.out.println("Key="+k+"Value="+v.value));
	}

}

class Node {
	int key;
	int value;
	Node previous;
	Node next;
	
	public Node(int key, int value){
	        this.key=key;
	        this.value=value;
	    }
}
