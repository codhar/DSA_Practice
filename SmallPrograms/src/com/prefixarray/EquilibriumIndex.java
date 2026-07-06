package com.prefixarray;

public class EquilibriumIndex {

    public static void main(String[] args){
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        Solution solution = new Solution();
        int result = solution.solve(A);
        System.out.println("Equilibrium index: " + result);
    }


    static class Solution {
        public int solve(int[] A) {
            float totalSum =0;

            for(int i =0 ; i <A.length ; i++){
                totalSum = totalSum + A[i];
            }
            //System.out.println("total Sum "+totalSum);
            float leftSum = 0;
            float rightSum = totalSum;
            for(int j =0 ; j< A.length ; j++){
                rightSum = rightSum -A[j];
                if( leftSum == rightSum){
                    return j;
                }
                leftSum = leftSum + A[j];
            }
            return -1;
        }
    }

}

//Q4. Equilibrium index of an array
//        Solved
//feature icon
//Using hints except Complete Solution is Penalty free now
//Use Hint
//Problem Description
//
//You are given an array A of integers of size N.
//
//Your task is to find the equilibrium index of the given array
//
//The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
//
//If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
//
//Note:
//
//Array indexing starts from 0.
//If there is no equilibrium index then return -1.
//If there are more than one equilibrium indexes then return the minimum index.
//
//
//
//
//        Problem Constraints
//
//1 <= N <= 105
//        -105 <= A[i] <= 105
//
//
//Input Format
//
//First arugment is an array A .
//
//
//Output Format
//
//Return the equilibrium index of the given array. If no such index is found then return -1.
//
//
//Example Input
//
//Input 1:
//A = [-7, 1, 5, 2, -4, 3, 0]
//Input 2:
//
//A = [1, 2, 3]
//
//
//Example Output
//
//Output 1:
//        3
//Output 2:
//
//        -1
//
//
//Example Explanation
//
//Explanation 1:
//i   Sum of elements at lower indexes    Sum of elements at higher indexes
//0                   0                                   7
//        1                  -7                                   6
//        2                  -6                                   1
//        3                  -1                                  -1
//        4                   1                                   3
//        5                  -3                                   0
//        6                   0                                   0
//
//        3 is an equilibrium index, because:
//A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
//Explanation 1:
//
//i   Sum of elements at lower indexes    Sum of elements at higher indexes
//0                   0                                   5
//        1                   1                                   3
//        2                   3                                   0
//Thus, there is no such index.
//
//
//
//        Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
//Arg 1: An Integer Array, For e.g [1,2,3]
//Enter Input Here
//        Run
