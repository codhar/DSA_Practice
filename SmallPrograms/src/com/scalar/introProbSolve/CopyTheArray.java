package com.scalar.introProbSolve;

import java.util.ArrayList;
import java.util.List;

public class CopyTheArray {
    public static void main(String args[]) {
        Solution solution = new Solution();
        List<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
        int B = 5;
        System.out.println(solution.solve(A, B));
    }

    public int[] solve(int[] A) {
        int n = A.length;
        int B[] = new int[n];
        for(int i=0 ; i< n ; i++) {
        	B[i] = A[i];
        }
        return B;
    }
}

class Solution {
    public ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(Integer a : A){
            result.add(a+B);
        }
        return result;
    }
}

//Q3. Copy the Array
//        Unsolved
//feature icon
//Using hints except Complete Solution is Penalty free now
//Use Hint
//Problem Description
//
//You are given a constant array A and an integer B.
//
//You are required to return another array where outArr[i] = A[i] + B.
//
//
//
//        Problem Constraints
//
//1 <= A.size() <= 10000
//
//        1 <= A[i] <= 10000
//
//        1 <= B <= 10000
//
//
//
//Input Format
//
//First argument is a constant array A.
//
//Second argument is an integer B.
//
//
//
//Output Format
//
//You have to return an integer array.
//
//
//
//        Example Input
//
//Input 1:
//
//A = [1,2,3,2,1]
//B = 3
//Input 2:
//
//A = [1,1,10]
//B = 6
//
//
//Example Output
//
//Output 1:
//
//        [4,5,6,5,4]
//Output 2:
//
//        [7,7,16]
//
//
//Example Explanation
//
//Explanation 1:
//
//A[0] + 3 = 1 + 3 = 4
//A[1] + 3 = 2 + 3 = 5
//A[2] + 3 = 3 + 3 = 6
//A[3] + 3 = 2 + 3 = 5
//A[4] + 3 = 1 + 3 = 4
//
//
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
//Arg 1: An Integer Array, For e.g [1,2,3]
//Enter Input Here
//Arg 2: A single Integer, For e.g 9
//Enter Input Here
//        Run