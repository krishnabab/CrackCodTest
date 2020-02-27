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
		LRUCache myCache = new LRUCache(3);
		String query = "SET 1 2 SET 2 3 SET 1 5 SET 4 5 SET 6 7 GET 4 GET 1";
		String words[] = query.split(" ");
		for (int i=0 ; i< words.length;i++) {
			if ("SET".equalsIgnoreCase(words[i]))
				myCache.set(Integer.valueOf(words[i+1]),Integer.valueOf(words[i+2]));
			if ("GET".equalsIgnoreCase(words[i]))
				myCache.get(Integer.valueOf(words[i+1]));
		}
		myCache.displayCache();
		}

	private void get(int key) {
		if (lruCache.containsKey(key)) {
			//System.out.println("Key:"+key+"Value:"+lruCache.get(key).value);
			//move this node to head position
			lruCache.get(key).next = head;
			head = lruCache.get(key);
			
		}
		else {
			System.out.println("Not exists in cache");
		}
		//displayCache();
	}

	private void set(int key, int value) {
		
		Node temp = new Node(key, value);
		
		if (head == null && tail == null) {
			temp.previous = null;
			temp.next=null;
			head = temp;
			tail = temp;
		}else {
			temp.next= head;
			head = temp;
			if(lruCache.size() > cap) {
				lruCache.remove(tail.key);
				tail.previous.next = null;
			}
		}
		lruCache.put(key, temp);
			
		//displayCache();
	}
	public void displayCache () {
		this.lruCache.forEach((k,v)->System.out.println("Key="+k+"Value="+v.value));
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
