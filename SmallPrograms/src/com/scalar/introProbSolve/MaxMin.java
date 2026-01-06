package com.scalar.introProbSolve;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {
    public static void main(String args[]) {
        SolutionMaxMin solution = new SolutionMaxMin();
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        int B = 2;
        System.out.println(solution.solve(A, B));
    }
}

class SolutionMaxMin {
    public int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        Integer max = A.get(A.size() - B);
        Integer min = A.get(B-1);
        return max-min;
    }
}

//Q4. MAX - MIN
//        Solved
//feature icon
//Using hints except Complete Solution is Penalty free now
//Use Hint
//Given an array of integers A and an integer B, find and return the difference of B'th max element and B'th min element of the array A.
//
//
//        Input Format
//
//The first argument given is the integer array A.
//The second argument given is integer B.
//        Output Format
//
//Return the value of B'th max element of A - B'th min element of A.
//        Constraints
//
//1 <= B <= length of the array <= 100000
//        -10^9 <= A[i] <= 10^9
//For Example
//
//Input 1:
//A = [1, 2, 3, 4, 5]
//B = 2
//Output 1:
//        2   (4 - 2 = 2)
//
//Input 2:
//A = [5, 17, 100, 11]
//B = 1
//Output 2:
//        95  (100 - 5 = 95)
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases