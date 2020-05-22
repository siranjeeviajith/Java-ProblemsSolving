package com.randomProblems;

import java.util.*;

 class Hello5 {
    
    static void getArray(int arr[],Scanner sc){
        for(int ind=0;ind<arr.length;ind++){
            arr[ind]=sc.nextInt();
        }
    }
    static boolean isFormed(int arr1[],int arr2[],int preVal,int index1,int index2,List<Integer> series){
        if(index1==arr1.length && index2==arr2.length){
           for(int val=0;val<series.size();val++){
               System.out.print(series.get(val)+" ");
           }
            return true;
        }
        if(index1<arr1.length && preVal%2 != arr1[index1]%2){
          series.add(arr1[index1]);
            if(isFormed(arr1,arr2,arr1[index1],index1+1,index2,series)){
                return true;
            }
            series.remove(series.size()-1);
        }
        if(index2<arr2.length && preVal%2!= arr2[index2]%2){
            series.add(arr2[index2]);
            if(isFormed(arr1,arr2,arr2[index2],index1,index2+1,series)){
                return true;
            }
            series.remove(series.size()-1);
        }
        return false;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int[] arr1=new int[N];
	    int[] arr2=new int[N];
	    getArray(arr1,sc);
	    getArray(arr2,sc);
	    List<Integer>series=new ArrayList<>();
	    System.out.print(isFormed(arr1,arr2,0,0,0,series));
	    
	  
	}
}
// input:
// 4
// 1 2 3 4
// 2 3 5 4
// output:
// yes
// Input:
// 4
// 1 4 5 7
// 2 3 2 3

// Output:
// no