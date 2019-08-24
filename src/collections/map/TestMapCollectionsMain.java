package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMapCollectionsMain {
	
	public static void main(String[] args) {
		
		//HashMap : for faster retrieval if you dont care about insertion order of keys
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(10,"ten");
		hashMap.put(9, "nine");
		hashMap.put(5, "five");
		hashMap.put(4,"four");
		hashMap.put(5, "five2");
		hashMap.put(null, "null");
		
		
		System.out.println("HashMap = "+hashMap);
		
		
		//LinkedHashMap : for faster insertion if you care about insertion order of keys
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		
		linkedHashMap.put(10,"ten");
		linkedHashMap.put(9, "nine");
		linkedHashMap.put(5, "five");
		linkedHashMap.put(4,"four");
		linkedHashMap.put(5, "five2");
		linkedHashMap.put(null, "null");
		
		
		System.out.println("LinkedHashMap = "+linkedHashMap);
		
		
		
		//TreeMap : if you want to sort the keys in a custom order
		//cannot take null, supports duplicates
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>(new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2){
					return -1;
				}
				//Remove this elseif if you want to support duplicates
				else if(o1==o2){
					return 0;
				}
				else{
					return 1;
				}
			}
		});
				
		treeMap.put(10,"ten");
		treeMap.put(9, "nine");
		treeMap.put(5, "five");
		treeMap.put(4,"four");
		treeMap.put(5, "five2");
		//treeMap.put(null, "null"); cannot take null, supports duplicates
				
		System.out.println("treeMap sorted by keys = "+treeMap);
		
		
		//To Sort a Map by values : Tree map with an existing comparator can't be provided as input
		hashMap.remove(null);
		Map<Integer,String> treeMap2 = createSortedByValueMap(hashMap);
				
		System.out.println("treeMap sorted by values = "+treeMap2);
		
		
		//There are other maps available 
		//IdentityHashMap
		//WeakHashMap
		//EnumMap
	}
	
	
	public static Map<Integer,String> createSortedByValueMap(final Map<Integer,String> treeMap){
		
		Comparator<Integer> valueComparator = new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				String vo1 = treeMap.get(o1);
				String vo2 = treeMap.get(o2);
				int compare = vo1.compareTo(vo2);
				System.out.println("comparing");
				if(vo1.equals(vo2)){
					return 1;
				}
				else{
					return -1;
				}
			}
		};
		
		
		TreeMap<Integer,String> treeMap2 = new TreeMap<Integer,String>(valueComparator);
		treeMap2.putAll(treeMap);
		return treeMap2;
		
	}

}
