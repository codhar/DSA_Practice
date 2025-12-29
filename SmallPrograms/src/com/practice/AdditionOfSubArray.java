package com.practice;
// calculate addition of all sub arrays sums
public class AdditionOfSubArray {

    public static void main(String args[]){
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        int result = new AdditionOfSubArray().additionOfSubArray(intArray);
        System.out.println(result);
    }

    public int additionOfSubArray(int[] intArray){
        int sum = 0;
        for(int i = 0; i < intArray.length; i++){
            for(int j = i; j < intArray.length; j++){
                for(int k = i; k <= j; k++){
                    sum += intArray[k];
                }
            }
        }
        return sum;
    }
}
