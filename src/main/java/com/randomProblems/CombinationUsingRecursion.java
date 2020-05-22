package com.randomProblems;

import java.util.*;

public class CombinationUsingRecursion {
    static void printCombo(int arr[],int index,int combo[],int cInd){
        if(cInd==combo.length){
            for(int ind1=0;ind1<combo.length;ind1++){
                System.out.print(combo[ind1]+" ");
            }
            System.out.println();
            return;
        }
        for(int ind=index;ind<arr.length;ind++){
            combo[cInd]=arr[ind];
            printCombo(arr,ind+1,combo,cInd+1);
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    int[] arr=new int[N];
	    for(int ind=0;ind<N;ind++){
	        arr[ind]=sc.nextInt();
	    }
	    for(int combos=1;combos<=N;combos++){
	        int[] combo=new int[combos];
	        printCombo(arr,0,combo,0);
	    }
	}
}