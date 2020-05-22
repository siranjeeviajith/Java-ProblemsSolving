package com.randomProblems;

import java.util.*;
public class Hello {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] str=sc.nextLine().toCharArray();
        int N=sc.nextInt();
        int count=0;
        
        int count1=0;
        while(count1<str.length){
            count=0;
            for(int ind=str.length-1;ind>=0;ind--){
                count++;
                if(count==N&&str[ind]!='*'){
                    System.out.print(str[ind]);
                    str[ind]='*';
                    count=0;
                }
                    
            }count1++;
        }
        
	}
}