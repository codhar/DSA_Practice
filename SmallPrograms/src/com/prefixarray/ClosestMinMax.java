package com.prefixarray;

public class ClosestMinMax {
    public static void main(String[] args){
        int[] A = {2, 1, 3, 1, 4, 3, 4, 2};
        SolutionClosestMinMax solution = new SolutionClosestMinMax();
        int result = solution.solve(A);
        System.out.println(result);
    }
}

class SolutionClosestMinMax {
    public int solve(int[] A) {
        int distance = 1;
        int minIndex = 0;
        int maxIndex = 0;
        int max = A[0];
        int min = A[0];
        for(int index = 1; index < A.length; index++){
            if(A[index] <= min){
                if(A[index] == min){
                    distance = Math.min(distance, (index-maxIndex)+1);
                }else{
                    distance = (index-maxIndex)+1;
                    min = A[index];
                }
                minIndex = index;
            }else if(A[index] >= max){
                if(A[index] == max){
                    distance = Math.min(distance, (index-minIndex)+1);
                }else{
                    distance = (index-minIndex)+1;
                    max = A[index];
                }
                maxIndex = index;
            }
        }
        return distance;
    }
}


//Q3. Closest MinMax
//Solved
//feature icon
//Using hints except Complete Solution is Penalty free now
//Use Hint
//Problem Description
//
//Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
//
//and at least one occurrence of the minimum value of the array.
//
//
//
//Problem Constraints
//
//1 <= |A| <= 2000
//
//
//
//Input Format
//
//First and only argument is vector A
//
//
//
//Output Format
//
//Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
//
//
//
//Example Input
//
//Input 1:
//
//A = [1, 3, 2]
//Input 2:
//
//A = [2, 6, 1, 6, 9]
//
//
//Example Output
//
//Output 1:
//
//        2
//Output 2:
//
//        3
//
//
//Example Explanation
//
//Explanation 1:
//
//Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
//        Explanation 2:
//
//Take the last 3 elements of the array.


