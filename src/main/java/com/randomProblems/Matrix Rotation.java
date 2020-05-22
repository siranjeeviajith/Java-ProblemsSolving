package com.randomProblems;

import java.util.*;
public class Hello {
    static void leftToRight(int matrix[][],int from,int to){
        for(int col=from;col<to;col++){
            matrix[from][col]=matrix[from][col+1];
        }
    }
    static void topToBottom(int matrix[][],int from,int to){
        for(int row=from;row<to;row++){
            matrix[row][to]=matrix[row+1][to];
        }
    }
    static void rightToLeft(int matrix[][],int from,int to){
        for(int col=to;col>from;col--){
            matrix[to][col]=matrix[to][col-1];
        }
    }
    static void bottomToTop(int matrix[][],int from,int to){
        for(int row=to;row>from;row--){
            matrix[row][from]=matrix[row-1][from];
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int matrix[][]=new int[N][N];
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                matrix[row][col]=sc.nextInt();
            }
        }
        int ringCount=N/2;
        for(int ring=1;ring<=ringCount;ring++){
            int from=ring,to=N-ring-1;
            int temp=matrix[from][from];
            leftToRight(matrix,from,to);
            topToBottom(matrix,from,to);
            rightToLeft(matrix,from,to);
            bottomToTop(matrix,from,to);
            matrix[from+1][from]=temp;
        
        }
        
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                System.out.print(matrix[row][col]+" ");
            }System.out.println();
        }

	}
}