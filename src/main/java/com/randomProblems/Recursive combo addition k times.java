package com.randomProblems;

import java.util.*;
public class Hello {
    static void printCombo(int arr[],int index,int combo[],int comInd,int X){
            int sum=0;
        if(comInd==combo.length){
            String str="";
            for(int ind=0;ind<combo.length;ind++){
                sum+=combo[ind];
                str+=combo[ind]+" ";
            }
            if(sum==X){
               System.out.println(str);
            }
                return;
        }
        for(int ind=index;ind<arr.length;ind++){
            combo[comInd]=arr[ind];
            printCombo(arr,ind+1,combo,comInd+1,X);
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),X=sc.nextInt(),K=sc.nextInt();
		int[] arr=new int[N];
		for(int ind=0;ind<N;ind++){
		    arr[ind]=sc.nextInt();
		}
		int [] combo=new int[K];
		printCombo(arr,0,combo,0,X);

	}
}