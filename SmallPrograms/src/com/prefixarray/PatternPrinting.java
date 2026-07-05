package com.prefixarray;

public class PatternPrinting {

    // write main method for to call solve method and print the result
    public static void main(String[] args) {
        int A = 4;
        Solution solution = new Solution();
        int[][] result = solution.solve(A);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


    static class Solution {
        public int[][] solve(int A) {
            int[][] result = new int[A][A];
            for(int i =0; i < A; i++){
                int temp = 1;
                for(int j= 0 ; j<A; j++){
                    if(j <= i){
                        result[i][j] = temp;
                        temp++;
                    }else {
                        result[i][j] = 0;
                    }

                }
            }
            return result;
        }
    }

}



//Question:
//Q2. Pattern Printing -1
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
//        1 0 0
//
//        1 2 0
//
//        1 2 3
//
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
//        [1, 0, 0]
//        [1, 2, 0]
//        [1, 2, 3]
//        ]
//Output 2:
//
//        [
//        [1, 0, 0, 0]
//        [1, 2, 0, 0]
//        [1, 2, 3, 0]
//        [1, 2, 3, 4]
//        ]
//
//
//Example Explanation
//
//Explanation 2:
//
//
//For A = 4 pattern looks like:
//        1 0 0 0
//        1 2 0 0
//        1 2 3 0
//        1 2 3 4
//So we will return it as two-dimensional array.
//
//
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
//Arg 1: A single Integer, For e.g 9
//Enter Input Here
