package Basics;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*Problem:
Design and implement a Least Recently Used (LRU) Cache with the following functionality:
The cache should have a fixed capacity.
It should support two operations efficiently:
get(key): Retrieve the value associated with the key. If the key is not present, return -1.
put(key, value): Insert a new key-value pair into the cache. If the cache reaches its capacity, remove the least recently used (LRU) key before inserting a new entry.*/
public class Altrimetrik<K,V> {

	int capacity;
	Map<K,V> cache;
	Deque<K> order;
	
	public Altrimetrik(int capacity)
	{
		this.capacity=capacity;
		this.cache=new HashMap<>();
		this.order=new LinkedList<>();
	}
	
	public V get(K key)
	{
		
			order.remove(key);
			order.addLast(key);
			return cache.get(key);
	}
	
	public void put(K key, V value)
	{
		if(cache.containsKey(key))
		{
			order.remove(key);
		}
		else if(cache.size()==capacity)
		{
			K lrukey = order.pollFirst();
			cache.remove(lrukey);
		}
		cache.put(key, value);
		order.addLast(key);
		
	}
	public void printCache()
	{
		System.out.println(cache);
	}
	
	
}
