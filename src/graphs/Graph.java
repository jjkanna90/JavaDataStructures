package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T> {
	
	List<GraphNode<T>> vertices = new ArrayList<GraphNode<T>>();
	Map<T,GraphNode<T>> verticeNodeMap = new HashMap<T,GraphNode<T>>();
	
	public void addVertex(T data){
		if(!verticeNodeMap.containsKey(data)){
			verticeNodeMap.put(data, new GraphNode<T>(data));
		}
	}
	
	public List<GraphNode<T>> getVertices(){
		return vertices;
	}
	
	public void addEdge(T from, T to){
		if(!verticeNodeMap.containsKey(from)){
			throw new UnsupportedOperationException("Edge From vertex is not registered to graph");
		}
		if(!verticeNodeMap.containsKey(to)){
			throw new UnsupportedOperationException("Edge To vertex is not registered to graph");
		}
		
		GraphNode<T> fromNode = verticeNodeMap.get(from);
		GraphNode<T> toNode = verticeNodeMap.get(to);
		fromNode.addChild(toNode);
	}
	
	
	public void addEdge(GraphNode<T> fromNode, GraphNode<T> toNode){
		List<GraphNode<T>> values = (List<GraphNode<T>>)verticeNodeMap.values();
		if(!values.contains(fromNode)){
			throw new UnsupportedOperationException("Edge From vertex is not registered to graph");
		}
		if(!values.contains(toNode)){
			throw new UnsupportedOperationException("Edge To vertex is not registered to graph");
		}
		
		fromNode.addChild(toNode);
	}

}
