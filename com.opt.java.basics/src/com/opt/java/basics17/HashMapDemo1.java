package com.opt.java.basics17;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Map interface [is called as it is not a part of collection framework] why?
//Key and Value pair
//HashMap example

public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<Integer,String> refMap=new HashMap<Integer,String>();
		refMap.put(101, "Singapore");//Key and value pair	
		refMap.put(101, "Singapore");//key we have passed duplicate, so value will be override
		refMap.put(101, "Japan");
		refMap.put(201, "Singapore");
	
		if(refMap.get(101).equals("Japan")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
//To print records from Map interface we have to use either Entry [entryset()/Key(keyset()]
		
		Set<Entry<Integer,String>> entries=refMap.entrySet();
		
//		//Method 1
//		entries.forEach(System.out::println);
//		
//		//Method 2
//		entries.forEach(entry->System.out.println(entry.getKey()+ " "+entry.getValue()));
		
		//Method 3
//		for(Entry<Integer,String> entry:entries) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		//Method 4: using keyset()
		refMap.keySet().forEach(key-> System.out.println("Key= "+key+" value= "+refMap.get(key)));
		
		//Replace (key,value)
		refMap.replace(101, "Malaysia");
		
		//Method 5: using keyset()
		for(Integer key:refMap.keySet()) {
			System.out.println("Key= "+key+" Value= "+refMap.get(key));
		}
		
		
	}

}
