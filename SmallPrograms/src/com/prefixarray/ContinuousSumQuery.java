package com.prefixarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ContinuousSumQuery {
    public static void main(String args[]) {
        int A = 5;
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(1, 2, 10)));
        B.add(new ArrayList<>(Arrays.asList(2, 3, 20)));
        B.add(new ArrayList<>(Arrays.asList(2, 5, 25)));

        SolutionContinuousSumQuery solution = new SolutionContinuousSumQuery();
        ArrayList<Integer> result = solution.solve(A, B);
        System.out.println(result); // Output: [10, 55, 45, 25, 25]
    }
}

class SolutionContinuousSumQuery {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(A, 0));
        for (ArrayList<Integer> operation : B) {
            int L = operation.get(0);
            int R = operation.get(1);
            int P = operation.get(2);

            result.set(L - 1, result.get(L - 1) + P);
            if (R < A) {
                result.set(R, result.get(R) - P);
            }
        }
        for (int i = 1; i < A; i++) {
            result.set(i, result.get(i) + result.get(i - 1));
        }

        return result;
    }
}


//Q1. Continuous Sum Query
//        Solved
//feature icon
//Using hints except Complete Solution is Penalty free now
//Use Hint
//Problem Description
//
//There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.
//
//Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
//For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B
//
//
//Problem Constraints
//
//1 <= A <= 2 * 105
//        1 <= L <= R <= A
//1 <= P <= 103
//        0 <= len(B) <= 105
//
//
//Input Format
//
//The first argument is a single integer A.
//The second argument is a 2D integer array B.
//
//
//        Output Format
//
//Return an array(0 based indexing) that stores the total number of coins in each beggars pot.
//
//
//Example Input
//
//Input 1:-
//A = 5
//B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
//
//
//Example Output
//
//Output 1:-
//        10 55 45 25 25
//
//
//Example Explanation
//
//Explanation 1:-
//First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
//Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
//Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]
//
//
//
//Expected Output
//Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases

