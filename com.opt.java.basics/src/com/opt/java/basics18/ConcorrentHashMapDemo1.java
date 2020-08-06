package com.opt.java.basics18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//To Do Task
//What ConcurrentModificationException? in which case we get it? How we can avoid it?
//->ConcurrentModificationException occurs when an object is tried to be modified 
//concurrently when it is not permissible.
//->For example,the collection (List/Map/Set) can't be modified when other thread is 
//iterating. It will causes the iteration becomes undefined.
//->To avoid it we can use ConcurrentHashMap because it divided the object into number
//of segments according to the concurrency level so that it can run multiple thread on
//constant time.


//The difference between HashMap, ConcurrentHashMap and SynchronizedMap
//HashMap: accept null and not synchronized but HashTable doesn't accept null and 
//synchronized,the benefit of using HashMap is fast and retrieve 2 different object on 
//constant time.It supports Generics

//ConcurrentHashMap: enhancement of HashMap which can operate multiple thread on a single
//Object without any complications. But ConcurrentHashMap not accept null as key or value.

//SynchronizedMap: It will lock entire collection and give access to only one thread and
//blacks all other threads

//Based on the research ConcurrentHashMap will run faster than other 2.Refer from link below
//https://crunchify.com/hashmap-vs-concurrenthashmap-vs-synchronizedmap-how-a-hashmap-can-be-synchronized-in-java/

//How HashMap works internally [Bucket level locking]
//How ConcurrentHashMap works internally [Segment level locking]

//Concurrent

class Scenario1{
	static void myLogic() {
		
		//It avoid ConcurrentModificationException
		Map<String,String> refMap=new ConcurrentHashMap<>();
		refMap.put("Java","Spring Boot");
		refMap.put("JavaScript","React JS");
		refMap.put("Android","Kotlin");
		refMap.put("IOS","Swift");
		refMap.put(".net","C#");
		
		//It will check the key, if not present then only it will insert the value
		refMap.putIfAbsent("Java", "Avd Java");
		
		
		
		System.out.println("Without Iterator: "+refMap);
		
		//use Iterator
		Iterator<String> itr=refMap.keySet().iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			if(key.equals("Android"))
				refMap.put(key, "Adv kotlin");
		}
		refMap.replace("JavaScript", "React Native");
		System.out.println("After Iterator: "+refMap);
	}
}

class Scenario2{
	//write some code which will give ConcurrentModificationException
	static void myLogic2() {
		//If u use HashMap it will occur ConcurrentModificationException
		Map<Integer,String> refMap=new ConcurrentHashMap<>();
		refMap.put(1, "A");
		refMap.put(2, "B");
		refMap.put(3, "C");
		refMap.put(4, "D");
		refMap.put(5, "E");
		
		
		
		Iterator<Integer> itr=refMap.keySet().iterator();
		while(itr.hasNext()) {
			Integer key=itr.next();
			if(key.equals(4)) {
				refMap.put(2, "2");
			}
			
		}
		
		System.out.println(refMap);
	}
	
	
	
}
public class ConcorrentHashMapDemo1 {

	public static void main(String[] args) {
		//Scenario1.myLogic();
		Scenario2.myLogic2();
	}

}
