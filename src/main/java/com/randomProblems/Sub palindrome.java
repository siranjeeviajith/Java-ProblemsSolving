package com.randomProblems;

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
Scanner scan=new Scanner(System.in);
String str=scan.next();
char[]arr=str.toCharArray();
char[][]str2=new char[100][100];
int inc=2,count=0,row=0,column=0,length=0,cns=0;
for(int index=cns;index<str.length();index++)
{
    int temp=index;
    int i=0;
    
    count++;
    str2[row][column]=arr[temp];
    System.out.print(temp);
    temp++;
    column++;
    if(inc==str.length()-1)
    {
        cns=str.length();
    }
    if(temp==str.length())
    {
        index=cns;
        inc++;
        break;
    }
    }
    
    System.out.print("\n");
        length++;
        column=0;count=0;row++;
}
// char[][]arr2=new char[100][100];
// String str3=String.valueOf(str2);
// // for(int index=0;index<row;index++)
// {
//     System.out.print(str3+"\n");
// }
	}
