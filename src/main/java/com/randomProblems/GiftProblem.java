package com.randomProblems;

import java.util.*;
public class GiftProblem {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int[] arr=new int[N];
	for(int ind=0;ind<N;ind++){
	    arr[ind]=sc.nextInt();
	}
	int sum=2,value=2;
	
	for(int ind=1;ind<N;ind++){
	    
	    if(arr[ind]>arr[ind-1]){
	        value++;
	    }
	    else{
	        value=1;
	    }
	    sum+=value;
	}
	int sum2=1;value=1;
	for(int ind=N-2;ind>=0;ind--){
	    if(arr[ind+1]<arr[ind]){
	        value++;
	    }
	    else{
	        value=1;
	    }
	    sum2+=value;
	    System.out.print(value+" ");
	}
	System.out.println();
	System.out.print((sum>sum2)? sum:sum2);

	}
}