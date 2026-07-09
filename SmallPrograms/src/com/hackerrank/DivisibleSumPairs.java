package com.hackerrank;

import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main(String[] args) {

        int[] ar = {1, 3, 2, 6, 1, 2};
        int result = Solution.divisibleSumPairs(6, 3, ar);
        System.out.println(result);
    }


    static class Solution {

        public static int divisibleSumPairs(int n, int k, int[] ar) {
            int count=0;
            for(int i = 0 ; i< ar.length-1 ; i++){
                for(int j=i+1 ; j<ar.length ; j++){
                    if(i != j){
                        int temp = ar[i] + ar[j];
                        if(temp%k ==0){
                            count++;
                        }
                    }
                }
            }
            return count;
        }

    }

}

//Given an array of integers and a positive integer , determine the number of  pairs where  and  +  is divisible by .
//
//        Example
//
//
//
//Three pairs meet the criteria:  and .
//
//        Function Description
//
//Complete the divisibleSumPairs function in the editor below.
//
//divisibleSumPairs has the following parameter(s):
//
//int n: the length of array
//int ar[n]: an array of integers
//int k: the integer divisor
//        Returns
//- int: the number of pairs
//
//Input Format
//
//The first line contains  space-separated integers,  and .
//The second line contains  space-separated integers, each a value of .
//
//        Constraints
//
//Sample Input
//
//STDIN           Function
//-----           --------
//        6 3             n = 6, k = 3
//        1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
//Sample Output
//
// 5
//Explanation
//
//Here are the  valid pairs when :
