package com.prefixarray;

public class SpecialSubsequencesAG {
    public static void main(String[] args){
        String A = "ABCGAG";
        SolutionSpecialSubsequencesAG solution = new SolutionSpecialSubsequencesAG();
        int result = solution.solve(A);
        System.out.println(result);
    }
}
class SolutionSpecialSubsequencesAG {
    public int solve(String A) {
        int count = 0 ;
        int ans = 0;
        int m = (int)1e9 + 7;
        for(int i =A.length()-1 ; i >=0 ; i--){
            char a = A.charAt(i);
            if(a == 'G'){
                count++;
            }
            if(a == 'A'){
                ans = (ans%m + count%m) %m;
            }
        }
        return ans % m;
    }
}

//Q4. Special Subsequences "AG"
//Solved
//feature icon
//Using hints except Complete Solution is Penalty free now
//Use Hint
//Problem Description
//
//You have given a string A having Uppercase English letters.
//
//You have to find how many times subsequence "AG" is there in the given string.
//
//NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
//
//
//
//        Problem Constraints
//
//1 <= length(A) <= 105
//
//
//
//Input Format
//
//First and only argument is a string A.
//
//
//
//Output Format
//
//Return an integer denoting the answer.
//
//
//
//Example Input
//
//Input 1:
//
//A = "ABCGAG"
//Input 2:
//
//A = "GAB"
//
//
//Example Output
//
//Output 1:
//
//        3
//Output 2:
//
//        0
//
//
//Example Explanation
//
//Explanation 1:
//
//Subsequence "AG" is 3 times in given string
//Explanation 2:
//
//There is no subsequence "AG" in the given string.
