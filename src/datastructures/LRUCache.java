package datastructures;

import java.util.HashMap;
import java.util.Iterator;

public class LRUCache {
	
	Node head;
	Node tail;
	HashMap<Integer, Node> lruCache = null;
	int cap;
	int count;
	
	public LRUCache(int capacity) {
		this.cap = capacity;
        this.lruCache = new HashMap<>();
        this.count = 0;
        head = new Node(0, 0); 
        tail = new Node(0, 0); 
        head.next = tail; 
        tail.previous = head; 
        head.previous = null; 
        tail.next = null; 
	}
	
	public static void main(String[] args) {
		LRUCache myCache = new LRUCache(3);
		String query = "SET 1 2 SET 2 3 SET 1 5 SET 4 5 SET 6 7 GET 4 GET 1 SET 8 9 GET 2";
		String words[] = query.split(" ");
		for (int i=0 ; i< words.length;i++) {
			if ("SET".equalsIgnoreCase(words[i]))
				myCache.set(Integer.valueOf(words[i+1]),Integer.valueOf(words[i+2]));
			if ("GET".equalsIgnoreCase(words[i]))
				myCache.get(Integer.valueOf(words[i+1]));
		}
		myCache.displayCache();
		}
	
	public void deleteNode(Node node) 
    { 
        node.previous.next = node.next; 
        node.next.previous = node.previous; 
    } 
  
    public void addToHead(Node node) 
    { 
        node.next = head.next; 
        node.next.previous = node; 
        node.previous = head; 
        head.next = node; 
    } 
	private void get(int key) {
		if (lruCache.containsKey(key)) {
			Node n = lruCache.get(key);
			deleteNode(n);
			addToHead(n);
			System.out.println("GET >> Key:"+key+"Value:"+lruCache.get(key).value);
		}
		else {
			System.out.println("Not exists in cache");
		}
		//displayCache();
	}

	private void set(int key, int value) {
		
		
		if (lruCache.get(key) != null) { 
            Node node = lruCache.get(key); 
            node.value = value; 
            deleteNode(node); 
            addToHead(node); 
        } 
		else { 
            Node node = new Node(key, value); 
            lruCache.put(key, node); 
            if (count < cap) { 
                count++; 
                addToHead(node); 
            } 
            else { 
            	lruCache.remove(tail.previous.key); 
                deleteNode(tail.previous); 
                addToHead(node); 
            } 
        } 
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
