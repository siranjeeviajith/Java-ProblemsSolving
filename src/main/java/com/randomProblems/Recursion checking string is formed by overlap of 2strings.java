package com.randomProblems;

import java.util.*;
class Hello {
    static boolean isForm(char arr1[],char arr2[],char arr3[],int index1,int index2,int index3){
        if(index1==arr1.length && index2==arr2.length && index3==arr3.length){
            return true;
        }
        if(index1<arr1.length &&index3<arr3.length && arr1[index1]==arr3[index3] )
        {
            if(isForm(arr1,arr2,arr3,index1+1,index2,index3+1)){
                return true;
            }
        }
        if(index2<arr2.length && index3<arr3.length && arr2[index2]==arr3[index3]){
            if(isForm(arr1,arr2,arr3,index1,index2+1,index3+1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] arr1=sc.nextLine().toCharArray();
		char[] arr2=sc.nextLine().toCharArray();
		char[] arr3=sc.nextLine().toCharArray();
		System.out.print(isForm(arr1,arr2,arr3,0,0,0));

	}
}