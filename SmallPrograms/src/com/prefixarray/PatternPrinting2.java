package com.prefixarray;

public class PatternPrinting2 {
    public static void main(String[] args) {
        int A = 4;
        SolutionPatternPrinting2 solution = new SolutionPatternPrinting2();
        int[][] result = solution.solve(A);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class SolutionPatternPrinting2 {
    public int[][] solve(int A) {

        int[][] B = new int[A][A];
        for(int i=0; i<A; i++) {
            for(int j=0; j<A; j++) {
                if(i+j < A-1 )
                    B[i][j] = 0;
                else
                    B[i][j] = A-j;
            }
        }
        return B;
    }
}

//Q1. Pattern Printing -2
//Solved
//feature icon
//Using hints except Complete Solution is Penalty free now
//Use Hint
//Problem Description
//
//Print a Pattern According to The Given Value of A.
//
//Example: For A = 3 pattern looks like:
//
//        1
//        2 1
//        3 2 1
//
//
//Problem Constraints
//
//1 <= A <= 1000
//
//
//Input Format
//
//First and only argument is an integer denoting A.
//
//
//
//        Output Format
//
//Return a two-dimensional array where each row in the returned array represents a row in the pattern.
//
//
//
//        Example Input
//
//Input 1:
//
//A = 3
//Input 2:
//
//A = 4
//
//
//Example Output
//
//Output :1
//
//        [
//        [0, 0, 1]
//        [0, 2, 1]
//        [3, 2, 1]
//        ]
//Output 2:
//
//        [
//        [0, 0, 0, 1]
//        [0, 0, 2, 1]
//        [0, 3, 2, 1]
//        [4, 3, 2, 1]
//        ]
//
//
//Example Explanation
//
//Explanation 2:
//
//
//For A = 4 pattern looks like:
//        1
//        2 1
//        3 2 1
//        4 3 2 1
//So we will return it as two-dimensional array.
//Row 1 contains 3 spaces and 1 integer so spaces will be considered as 0 in the output.
//
//
//        Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases