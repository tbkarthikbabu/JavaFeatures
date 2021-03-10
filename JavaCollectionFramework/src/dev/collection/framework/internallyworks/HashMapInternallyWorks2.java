package dev.collection.framework.internallyworks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * 
 * @author karth
 *
 */
public class HashMapInternallyWorks2 {

	public static void main(String[] args) {

		Map<Head, Integer> map = new HashMap<>();

		map.put(new Head("Sachin"), 99);
		map.put(new Head("DavidBegam"), 77);
		map.put(new Head("Dhoni"), 7);

		System.out.println("Value for key" + map.get(new Head("Sachin")));
		System.out.println("Value for key" + map.get(new Head("DavidBegam")));
		System.out.println("Value for key" + map.get(new Head("Dhoni")));

	}
}

class Head {

	String key;

	public Head(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Head [key=" + key + "]";
	}


    @Override
    public int hashCode() 
    { 
        int hash = (int)key.charAt(0); 
        System.out.println("hashCode for key: "
                           + key + " = " + hash); 
        return hash; 
    } 
  
    @Override
    public boolean equals(Object obj) 
    { 
        return key.equals(((Head)obj).key); 
    }
	
}
