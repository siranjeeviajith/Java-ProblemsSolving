package com.randomProblems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 * sample input1:
7
100 100 50 40 40 20 10
4
5 25 50 120
Sample Output 1

6
4
2
1
Sample input 2:
6
100 90 90 80 75 60
5
50 65 77 90 102

Sample Output 2

6
5
4
2
1
*/
public class ClimbingTheLeaderboard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        Set<Integer> set=new TreeSet<Integer>();
        int[] arr =new int[alice.length];
        for(int i=0;i<scores.length;i++){
            set.add(scores[i]);
        }
        List<Integer> list=new ArrayList<>(set);
        System.out.println(list);
        int j=0,i=0;
        for( i=0;i<list.size();){
            if(j>=alice.length){
                break;
            }
            if(alice[j]<list.get(i)){
                arr[j]=list.size()-i+1;
              //  System.out.println(alice[j]+"<"+list.get(i)+" "+(alice.length-j-1)+" "+i+2);
                j++;
            }else {
                i++;
            }
        }
        //j=(j>0)? j-1 : 0;
        i=(i>0)?( i-1) : 0;
        
        
        for(;j<alice.length;j++){
        System.out.println(i +" "+j);
            if(alice[j]>=list.get(i)){
                arr[j]=list.size()-i;
            }
        }
        //

        
        
        return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
