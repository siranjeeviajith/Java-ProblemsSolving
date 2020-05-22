package com.randomProblems;

import java.util.*;
public class GeometricSeries {
    
    static int getNPowerN(int N,int M){
        int result=1;
        for(int ctr=2;ctr<=N;ctr++){
            result*=M;
        }
        return result;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       if(N%2==0){
           System.out.print(getNPowerN(N/2,3));
       }
       else{
           System.out.print(getNPowerN((N+1)/2,2));
       }
        
	}
}