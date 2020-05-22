package com.randomProblems;

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];int count1=0;
		for(int ind=0;ind<N;ind++){
		    arr[ind]=sc.nextInt();
		} 		
        for(int count=1;count<(1<<N);count++){
            int index=0,ctr=count,sum1=0,sum2=0,ct=0;
            
            while(ctr!=0){
                if((ctr&1)==1){
                    ct++;
                    sum1+=arr[index];
                    
                }
                else{
                    sum2+=arr[index];
                    ct++;
                }
                ctr=ctr>>1;
                index++;
            }
            ctr=count;index=0;
                if(sum1==sum2 && ct==N){
                    count1++;
                    while(ctr!=0){
                        if((ctr & 1)==1){
                    System.out.print(arr[index]+" ");}
                    ctr=ctr>>1;
                    index++;
                        
                    }
                    System.out.print("- ");
                    ctr=count;index=0;
                    while(ctr!=0){
                        if((ctr & 1)==0){
                    System.out.print(arr[index]+" ");}
                    ctr=ctr>>1;
                    index++;
                        
                    }System.out.println();
                }
                
                
                
            
        }
        System.out.print(count1);
		

	}
}