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
    public String toString(){
        return "Node: "+nVal+" Distance: "+distance;
    }
}
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
// 		int E=sc.nextInt();
// 		Map<Integer,Set<Integer>> map=new HashMap<>();
// 		for(int ind=0;ind<E;ind++){
// 		    int row=sc.nextInt(),col=sc.nextInt();
// 		    Set <Integer> lis;
// 		    lis=map.getOrDefault(row,new HashSet<>());
// 		    lis.add(col);
// 		    map.put(row,lis);
// 		    lis=map.getOrDefault(col,new HashSet<>());
// 		    lis.add(row);
// 		    map.put(col,lis);
		    
// 		}
		Queue<Node> pq=new PriorityQueue<>();
		pq.add(new Node(1,5));
		pq.add(new Node(2,4));
		pq.add(new Node(3,3));
		pq.add(new Node(5,6));
		pq.add(new Node(5,7));
		while(!pq.isEmpty()){
		    System.out.println(pq.poll());
		}

	}
}