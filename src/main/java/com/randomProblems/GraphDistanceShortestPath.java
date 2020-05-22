package com.randomProblems;

import java.util.*;
class Node implements Comparable<Node>{
    int nVal;
    int distance;
    public Node(int val,int distance){
        this.nVal=val;
        this.distance=distance;
    }
    @Override
    public int compareTo(Node other){
        return this.distance - other.distance;
    }
    // public String toString(){
    //     return "Node: "+nVal+" Distance: "+distance;
    // }
}

public class GraphDistanceShortestPath {
    static void bfs(Map<Integer,Set<Node>>map,int node,int arr[]){
        Queue<Node>pq=new PriorityQueue<>();
        Set <Node> visit=new HashSet<>();
        Arrays.fill(arr,Integer.MAX_VALUE);
        Node currNode=new Node(node,0);
        pq.add(currNode);
        visit.add(currNode);
        arr[node]=0;
        while(!pq.isEmpty()){
            currNode=pq.poll();
            for(Node next : map.get(currNode.nVal)){
                if(!visit.contains(next)){
                    pq.add(next);
                    visit.add(next);
                    if(next.distance+arr[currNode.nVal]<arr[next.nVal]){
                        arr[next.nVal]=next.distance+arr[currNode.nVal];
                    }
                }
            }
            
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int E=sc.nextInt(),M=sc.nextInt();
		Map<Integer,Set<Node>> map=new HashMap<>();
		for(int ind=0;ind<E;ind++){
		    int row=sc.nextInt(),col=sc.nextInt(),dis=sc.nextInt();
		    Set <Node> lis;
		    lis=map.getOrDefault(row,new HashSet<>());
		    lis.add(new Node(col,dis));
		    map.put(row,lis);
		    lis=map.getOrDefault(col,new HashSet<>());
		    lis.add(new Node(row,dis));
		    map.put(col,lis);
		    
		}
		int node=sc.nextInt();
		int[] arr=new int[M+1];
		bfs(map,node,arr);
		for(int ind=1;ind<M+1;ind++){
		    System.out.println(node+"->"+ind+"="+arr[ind]);
		}
	    

	}
}
// 7 6
// 1 2 2
// 1 3 1
// 2 3 4
// 2 5 1
// 4 3 3
// 5 4 2
// 3 6 1 
// 2