package com.randomProblems;

import java.util.*;
public class GoodTransportation {
    
     
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int T=sc.nextInt();
	    int st[]=new int[N+1];
	    int cap[]=new int[N+1];
	    Set<Integer>source=new HashSet<>();
	    for(int ind=0;ind<T;ind++){
	        int val=sc.nextInt();
	        int dest=sc.nextInt();
	        cap[val]=sc.nextInt();
	        st[val]=dest;
	        source.add(val);
	    }
	    for(int ctr=1;ctr<=N;ctr++){
	        if(source.contains(st[ctr])){
	            source.remove(st[ctr]);
	        }
	    }
	    int totcap=0;
	    for(Integer src:source){
	            int min=cap[src];
	        while(st[src]!=0){
	            if(cap[src]<min){
	                min=cap[src];
	            }
	            src=st[src];
	        }
	        totcap+=min;
	        
	    }
	    System.out.print(totcap);
	    
	    
	    
		
	}
}