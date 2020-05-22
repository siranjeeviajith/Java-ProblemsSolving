package com.randomProblems;

import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;

	

	    /*
	     * Complete the 'getTotalX' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER_ARRAY a
	     *  2. INTEGER_ARRAY b
	     */
	/**Sample Input

2 3
2 4
16 32 96
Sample Output

3
Explanation

2 and 4 divide evenly into 4, 8, 12 and 16.
4, 8 and 16 divide evenly into 16, 32, 96.

4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b.
*/
		public class BetweenTwoSets {

	    public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
	    List<Integer> num=new ArrayList<>();
	    for(int ind=a.get(a.size()-1);ind<=b.get(0);ind++){
	        int count=0;
	        for(int ind1=0;ind1<a.size();ind1++){
	                    if(ind%a.get(ind1)==0){
	                        count++;
	                    }else{
	                        break;
	                    }
	        }if(count==a.size()){
	            num.add(ind);
	        }
	    }
	    for(int ind=0;ind<num.size();ind++){
	         for(int ind1=0;ind1<b.size();ind1++){
	             if(b.get(ind1)%num.get(ind)!=0){
	                 System.out.println(num.get(ind));
	                 num.remove(ind);
	                 ind--;
	                 break;
	             }
	        }
	    }
	    System.out.println(num);
	    return num.size();

	    }

	
	    public static void main(String[] args) throws IOException {
	    	Scanner sc=new Scanner(System.in);
	    	int M=sc.nextInt(),N=sc.nextInt();
	    	List<Integer>list1=new ArrayList<Integer>();
	    	List<Integer>list2=new ArrayList<Integer>();
	        for(int ind=0;ind<M;ind++) {
	        	list1.add(sc.nextInt());
	        }
	        for(int ind=0;ind<N;ind++) {
	        	list2.add(sc.nextInt());
	        }
	        System.out.println(getTotalX(list1,list2));
	    }
		}
	



