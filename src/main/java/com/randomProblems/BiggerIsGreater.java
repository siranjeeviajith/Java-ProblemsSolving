package com.randomProblems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 * Sample Input 0

5
ab
bb
hefg
dhck
dkhc
Sample Output 0

ba
no answer
hegf
dhkc
hcdk
Explanation 0

Test case 1:
ba is the only string which can be made by rearranging ab. It is greater.
Test case 2:
It is not possible to rearrange bb and get a greater string.
Test case 3:
hegf is the next string greater than hefg.
Test case 4:
dhkc is the next string greater than dhck.
Test case 5:
hcdk is the next string greater than dkhc.
Sample Input 1

6
lmno
dcba
dcbb
abdc
abcd
fedcbabcd
Sample Output 1

lmon
no answer
no answer
acbd
abdc
fedcbabdc
*/
public class Solution {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
        char[] arr=w.toCharArray();
        char low='*';
        char high=Character.MAX_VALUE;
        int index=0;
        boolean flag=true;
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i]>arr[i-1] ){
                low=arr[i-1];
                index=i-1;
                flag=false;
                break;
            }
        }
        if(!flag){

        
        int highIndex=0;
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]<high && arr[i]>low){
                high=arr[i];
                highIndex=i;
            }
        }
        char tmp=arr[index];
        arr[index]=arr[highIndex];
        arr[highIndex]=tmp;
        //System.out.println(tmp);
        for(int ind=index+1;ind<arr.length-1;ind++){
            if(arr[ind]>arr[ind+1]){
                tmp=arr[ind];
                arr[ind]=arr[ind+1];    
                arr[ind+1]=tmp;
                ind=index;
            }
        }
        
        return new String(arr);
        }
        else{
            return "no answer";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
