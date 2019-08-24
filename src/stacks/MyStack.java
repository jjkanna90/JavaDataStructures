package stacks;

import java.util.EmptyStackException;

public class MyStack<T> {
	
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		
		public StackNode (T data){
			this.data = data;
		}
	}
	
	
	StackNode<T> head=null;
	
	public void push(T data){
		StackNode<T> node = new StackNode<T>(data);
		node.next = head;
		head = node;
	}
	
	public T pop(){
		if(head == null){
			throw new EmptyStackException();
		}
		StackNode<T> temp = head;
		head = head.next;
		return temp.data;
	}
	
	public T peek(){
		if(head == null){
			throw new EmptyStackException();
		}
		StackNode<T> temp = head;
		return temp.data;
	}
	
	public boolean isEmpty(){
		return head==null;
	}

}
