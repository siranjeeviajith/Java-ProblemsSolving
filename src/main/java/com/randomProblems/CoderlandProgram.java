package com.randomProblems;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
SAMPLE INPUT
1
2
5 1
1 2

SAMPLE OUTPUT
7



 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes*/
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class CoderlandProgram {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input*/
        Scanner sc = new Scanner(System.in);
        int tcNumber = sc.nextInt();
        long petrolCosts[] = new long[(int) 100000];
        long chkPoints = 0;
        for (int tccounter = 0; tccounter < tcNumber; tccounter++) {
            chkPoints = sc.nextLong();
            long petrolVolume = 0;
            for (int costCounter = 0; costCounter < chkPoints; costCounter++)
                petrolCosts[costCounter] = sc.nextInt();
            long minimumcost = petrolCosts[0];
            for (int petrolcounter = 0; petrolcounter < chkPoints; petrolcounter++) {

                if (minimumcost > petrolCosts[petrolcounter]) {
                    minimumcost = petrolCosts[petrolcounter];
                }

                petrolVolume += minimumcost * sc.nextInt();

            }

            System.out.println(petrolVolume);

        }
    }
}
