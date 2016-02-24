package leetcode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class GraphValidTree {
	public static void main(String[] args){
		int[][] edges = {{0,1},{0,2},{0,3},{0,4}};
		int n = edges.length;
		
		List<Set<Integer>> graph = new ArrayList<>();
		if(edges.length!=n-1){
			System.out.println("Invalid");
		}
		
		for(int i=0; i<n; i++){
			graph.add(i,new HashSet<Integer>());
		}
		
		for(int[] edge: edges){
			graph.get(edge[0]).add(edge[1]);
			graph.get(edge[1]).add(edge[0]);
		}
		
		HashSet<Integer> visited = new HashSet<>();
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(0);
		visited.add(0);
		
		while(!queue.isEmpty()){
			int current = queue.poll();
			for(int next: graph.get(current)){
				if(visited.contains(next))
					System.out.println("False");
				queue.offer(next);
				visited.add(next);
				
				graph.get(next).remove((Integer)current);
			}
		}
		System.out.println(visited.size()==n);
	}
}
