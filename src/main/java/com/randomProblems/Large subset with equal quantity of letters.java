package com.randomProblems;

import java.util.*;
class Hello1 {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] arr=sc.nextLine().toCharArray();
		int len=arr.length;
		int max=0,value=0,pos=0;
		Map<Integer,Integer> posMap=new HashMap<>();
		posMap.put(value,pos);
		for(char ch:arr){
		    pos++;
		    if(ch=='a'){
		        value++;
		    }else{
		        value--;
		    }
		    if(posMap.containsKey(value)){
		        int curr=pos-posMap.get(value);
		        if(curr>max){
		            max=curr;
		        }
		    }
		    else{
		        posMap.put(value,pos);
		    }
		}
		System.out.print(max);
		

	}
}