package collections.test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSetCollectionsMain {
	
	public static void main(String[] args){
		
		
		System.out.println("Inputs = 10,9,4,5");
		
		//HashSet - Best performing : use only if order of insertion does not matter
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(9);
		hashSet.add(4);
		hashSet.add(5);
		
		System.out.println("HashSet = "+hashSet);
		
		
		//LinkedHashSet - Use if order of insertion does matter
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(9);
		linkedHashSet.add(4);
		linkedHashSet.add(5);
		
		System.out.println("LinkedHashSet = "+linkedHashSet);
		
		
		//TreeSet - to provide custom ordering using Comparator
		Set<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {
			
			public int compare(Integer o1, Integer o2) {
				return (o1<o2)?1:-1;
				
			}
			
		});
		treeSet.add(10);
		treeSet.add(9);
		treeSet.add(4);
		treeSet.add(5);
		
		System.out.println("TreeSet = "+treeSet);
		
		
		TreeSet<Integer> myTreeSet = (TreeSet<Integer>)treeSet;
		System.out.println("Subset from 11 to 5 "+myTreeSet.subSet(11, 5));
		System.out.println("TailSet from 5 "+myTreeSet.tailSet(5));
		System.out.println("Headset from 5 "+myTreeSet.headSet(5));
		
	}

}
