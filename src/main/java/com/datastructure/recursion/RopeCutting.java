package com.datastructure.recursion;

public class RopeCutting {
   static int maxCuts (int len , int a ,int b, int c) {
       if (len == 0)  return 0;
       if (len <= -1) return -1;
       int res = Math.max((maxCuts(len-a,a,b,c)),Math.max((maxCuts(len-b,a,b,c)), (maxCuts(len-b,a,b,c))));
       if (res == -1)
           return -1;
     return res+1;
   }
    public static void main (String args[])
    {
     int len = 5,a = 2,b = 1,c=5;
    System.out.print(maxCuts (len, a,b,c));
    }
}
