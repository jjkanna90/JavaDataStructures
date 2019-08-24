package queues;

import java.util.NoSuchElementException;

public class MyQueue<T> {
	
	private static class QueueNode<T>{
		private T data;
		private QueueNode<T> next;
		
		public QueueNode (T data){
			this.data = data;
		}
	}
	
	QueueNode<T> first=null;
	QueueNode<T> last=null;
	
	public void enqueue(T data){
		QueueNode<T> node = new QueueNode<T>(data);
		if(last!=null){
			last.next=node;
		}
		last = node;
		if(first == null){
			first = node;
		}
	}
	
	
	public T dequeue(){
		if(first == null){
			throw new NoSuchElementException();
		}
		T data = first.data;
		if(first==last){
			first=last=null;
		}else{
			first=first.next;
		}
		return data;
		
	}

}
