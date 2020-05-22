package com.randomProblems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * Output Format

Return the total number of matching pairs of socks that John can sell.

Sample Input

9
10 20 20 10 10 30 50 10 20
Sample Output

3
*/
public class SockMerchants {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer,Integer> map=new HashMap<>();
        int countPair=0;
        for(int i=0;i<n;i++){
            int count=map.getOrDefault(ar[i],0);
            if(count%2==1){
                countPair++;
            }
            count++;
            map.put(ar[i],count);
        }
        
        return countPair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
