package com.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class AcmICPCTeam {

    public static void main(String[] args) throws IOException {
        List<String> topic = new ArrayList<>();
        topic.add("10101");
        topic.add("11110");
        topic.add("00010");

        List<Integer> result = acmTeam(topic);
        System.out.println(result);

    }

        /*
         * Complete the 'acmTeam' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts STRING_ARRAY topic as parameter.
         */

        public static List<Integer> acmTeam(List<String> topic) {
            // Write your code here
            int noOfTopics = topic.get(0).length();
            List<Integer> result = new ArrayList<>();
            int max = 0 ;
            int maxCount = 0;


            for(int i =0; i < topic.size() -1; i++){
                for(int j = i+1; j < topic.size(); j++){
                    int test = commonTopic(topic.get(i), topic.get(j),noOfTopics);

                    if(test == max){
                        maxCount++;
                    }else if(test > max ){
                        max = test;
                        maxCount =  1;
                    }
                }
            }

            result.add(max);
            result.add(maxCount);
            return result;
        }

        private static int commonTopic(String A, String B, int size){
            int result = 0;

            for(int i =0 ; i<size; i++){
                if(A.charAt(i) == '1' || B.charAt(i) == '1'){
                    result = result +1 ;
                }
            }

            return result;
        }

    }
//
//    public class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            int n = Integer.parseInt(firstMultipleInput[0]);
//
//            int m = Integer.parseInt(firstMultipleInput[1]);
//
//            List<String> topic = IntStream.range(0, n).mapToObj(i -> {
//                        try {
//                            return bufferedReader.readLine();
//                        } catch (IOException ex) {
//                            throw new RuntimeException(ex);
//                        }
//                    })
//                    .collect(toList());
//
//            AcmICPCTeam Result;
//            List<Integer> result = Result.acmTeam(topic);
//
//            bufferedWriter.write(
//                    result.stream()
//                            .map(Object::toString)
//                            .collect(joining("\n"))
//                            + "\n"
//            );
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }


//There are a number of people who will be attending ACM-ICPC World Finals. Each of them may be well versed in a number of topics. Given a list of topics known by each attendee, presented as binary strings, determine the maximum number of topics a 2-person team can know. Each subject has a column in the binary string, and a '1' means the subject is known while '0' means it is not. Also determine the number of teams that know the maximum number of topics. Return an integer array with two elements. The first is the maximum number of topics known, and the second is the number of teams that know that number of topics.
//
//Example
//
//
//
//The attendee data is aligned for clarity below:
//
//        10101
//        11110
//        00010
//These are all possible teams that can be formed:
//
//Members Subjects
//        (1,2)   [1,2,3,4,5]
//        (1,3)   [1,3,4,5]
//        (2,3)   [1,2,3,4]
//In this case, the first team will know all 5 subjects. They are the only team that can be created that knows that many subjects, so  is returned.
//
//Function Description
//
//Complete the acmTeam function in the editor below.
//acmTeam has the following parameter(s):
//
//string topic: a string of binary digits
//        Returns
//
//int[2]: the maximum topics and the number of teams that know that many topics
//Input Format
//
//The first line contains two space-separated integers  and , where  is the number of attendees and  is the number of topics.
//
//Each of the next  lines contains a binary string of length .
//
//        Constraints
//
//
//
//Sample Input
//
//4 5
//        10101
//        11100
//        11010
//        00101
//Sample Output
//
//5
//        2
//Explanation
//
//Calculating topics known for all permutations of 2 attendees we get:
//
//
//
//
//
//
//
//The 2 teams (1, 3) and (3, 4) know all 5 topics which is maximal.
