package collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class TestListCollectionsMain {
	
	public static void main(String args[]){
	
		System.out.println("Inputs = 10,9,4,5,4");
		
		//ArrayList - Stores the elements in an array
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(9);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(4);
		
		System.out.println("ArrayList = "+arrayList);
		
		
		
		//LinkedList - Stores the elements in a linked list
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(9);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(4);
				
		System.out.println("LinkedList = "+linkedList);
		
		
		//Vector - Stores the elements in a linked list
		//Vector is synchronized
		//ArrayList is recommended over vector
		List<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.add(9);
		vector.add(4);
		vector.add(5);
		vector.add(4);
						
		System.out.println("Vector = "+vector);
		
		
		//Stack - Using Stack as a list
		List<Integer> stack = new Stack<Integer>();
		stack.add(10);
		stack.add(9);
		stack.add(4);
		stack.add(5);
		stack.add(4);
								
		System.out.println("Stack as list = "+stack);
		
		//To Use Stack as LIFO
		Stack<Integer> LIFOStack = (Stack<Integer>)stack;
		System.out.print("Stack as LIFO = ");
		System.out.print(LIFOStack.pop());
		System.out.print(","+LIFOStack.pop());
		System.out.print(","+LIFOStack.pop());
		System.out.print(","+LIFOStack.pop());
		System.out.print(","+LIFOStack.pop());
	}
}
