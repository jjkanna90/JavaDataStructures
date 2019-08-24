package graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> {
	
	T data = null;
	List<GraphNode<T>> adjacentElements = null;
	
	public GraphNode (T data){
		this.data = data;
		adjacentElements = new ArrayList<GraphNode<T>>();
		
	}
	
	public void addChild(GraphNode<T> child){
		if(!adjacentElements.contains(child)){
		adjacentElements.add(child);
		}
	}

}
