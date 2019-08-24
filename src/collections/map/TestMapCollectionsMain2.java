package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMapCollectionsMain2 {
	
	public static void main(String[] args) {
		
		//HashMap : for faster retrieval if you dont care about insertion order of keys
		TreeMap<String,String> treehMap = new TreeMap<String,String>();
		
		treehMap.put("cat dog","ten");
		treehMap.put("aero man", "nine");
		treehMap.put("man jive", "five");
		
		
		System.out.println("HashMap = "+treehMap);
		
		
	  
	}
	
	
	

}
