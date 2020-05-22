package com.randomProblems;

import java.util.*;
public class Hello {
    static int checkVow(String str){
        String[] str1= str.split(" ");
        for(int ind1=0;ind1<str1.length;ind1++){
        int count=0;
        for(int ind=0;ind<str1[ind1].length();ind++){
            if(str1[ind1].charAt(ind)=='a'||str1[ind1].charAt(ind)=='e'||str1[ind1].charAt(ind)=='i'||str1[ind1].charAt(ind)=='o'||str1[ind1].charAt(ind)=='u'){
                count++;
            }
        }
        if(count>1){
            return 1;
        }
        }
        return 0;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		for(int ind=0;ind<(1<<str.length);ind++){
		    int ctr=ind,count=0,index=0;
		    String str1="";
		    while(ctr>0){
		        if((ctr&1)==1){
		            str1=str1+" "+str[index];
		        }
		        ctr=ctr>>1;index++;
		    }
		        
		        if(checkVow(str1)==1){
		            System.out.print(str1+",");
		        }
		}

	}
}