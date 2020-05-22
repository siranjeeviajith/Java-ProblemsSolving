package com.randomProblems;

import java.util.*;
public class MatrixMaxValue {

//input:
// 3
// 12 13 40 
// 10 15 23
// 20 800 30
// output:
// 12 25 65 
// 22 40 88 
// 42 842 872 
// 872
// 3 4
// 12 13 40 12
// 10 15 23 45
// 20 80 30 65

// 12 25 75 115 
// 10 35 103 148 
// 20 100 130 195 
// 195

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int N=sc.nextInt();
		int[][] arr=new int[M+1][N];
		for(int row=0;row<M;row++){
		for(int col=0;col<N;col++){
		    arr[row][col]=sc.nextInt();
		}}
		int val=0,val1=0;
		int[][] arr1=new int[M][N];
		arr1[0][0]=arr[0][0];
		
		for(int row=0;row<M;row++){
		    arr1[row][0]=arr[row][0];
		}
		for(int col=0;col<N;col++){
		    arr[M][col]=0;
		}
	
		
		for(int col=1;col<N;col++){
		    for(int row=0;row<M;row++){
		        if(row==0){
		            arr1[row][col]=arr[row][col]+Math.max(arr1[row][col-1],arr1[row+1][col-1]);
		        }
		        else{
		       arr1[row][col]=arr[row][col]+Math.max(arr1[row-1][col-1],Math.max(arr1[row][col-1],arr[row+1][col-1]));
		        }
		    }
		}
		for(int row=0;row<M;row++){
		    for(int col=0;col<N;col++){
		        System.out.print(arr1[row][col]+" ");
		    }System.out.println();
		}
	    int max=0;
	    for(int row=0;row<M;row++){
	        if(max<arr1[row][N-1]){
	            max=arr1[row][N-1];
	        }
	    }
	    System.out.print(max);

	}
}