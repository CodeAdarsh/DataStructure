package com.datastructure.recursion;

/*Description
Maximum Difference problem is to find the maximum of arr[j] - arr[i] where j>i.
*/

public class MaximumDifference {
    public static int findMaxDiff(int arr[], int len)
    {
       int diff = arr[0] - arr[1];
       int min = arr [0];
       for (int i =1;i <len; i++)
       {
           if (diff < arr[i]-min)
               diff = arr[i]-min;
           if (arr[i] < min)
               min = arr[i];
       }
       return diff;
    }
    public static void main(String args [])
    {
        int arr [] = {2,3,5,10,11,13,17,9,1,27};
        int len = arr.length;
        System.out.println(findMaxDiff(arr, len));
    }
}
