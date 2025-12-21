package com.scalar.introProbSolve;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMin2 {
    public static void main(String args[]) {
        SolutionMaxMin2 solution = new SolutionMaxMin2();
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(3);
        A.add(5);
        A.add(2);
        A.add(4);
        System.out.println(solution.solve(A));
    }
}


class SolutionMaxMin2 {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        return A.get(A.size()-1) + A.get(0);
    }
}

//Q5. Max Min
//Solved
//feature icon
//Using hints except Complete Solution is Penalty free now
//Use Hint
//Problem Description
//
//Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
//
//        NOTE: You should make minimum number of comparisons.
//
//
//
//        Problem Constraints
//
//1 <= N <= 105
//
//        -109 <= A[i] <= 109
//
//
//
//Input Format
//
//First and only argument is an integer array A of size N.
//
//
//
//Output Format
//
//Return an integer denoting the sum Maximum and Minimum element in the given array.
//
//
//
//Example Input
//
//Input 1:
//
//A = [-2, 1, -4, 5, 3]
//Input 2:
//
//A = [1, 3, 4, 1]
//
//
//Example Output
//
//Output 1:
//
//        1
//Output 2:
//
//        5
//
//
//Example Explanation
//
//Explanation 1:
//
//Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
//Explanation 2:
//
//Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
//
//
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases

