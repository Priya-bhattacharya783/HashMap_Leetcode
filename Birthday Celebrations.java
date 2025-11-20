In a hostel, there are birthday celebrations every month. Find the number of days where there are odd number of birthday celebrations? Given an array of integers containing birthdays, the goals to get a count of those days where odd number of birthdays are celebrated.

Input Format

The first line is size of the array say n. Each of the subsequent n lines contains the array element at index x, where x is [1,n].
Constraints

0 <= n <= 31
Output Format

The number of days where there are odd number of birthday celebrations?
Sample Input 0

5
4
8
2
8
9
Sample Output 0

3
Explanation 0

There are 5 numbers in this array, 4 has occurred once which is odd, so it meets the criteria, 8 doesn’t it occurred twice, 2 and 9 meet the criteria of occurring odd number of time. So, the output is 3.

Solutuin
=======================================


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int count = 0;
        for (int key : freq.keySet()) {
            if (freq.get(key) % 2 != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
 
