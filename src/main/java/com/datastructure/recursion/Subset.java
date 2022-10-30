package com.datastructure.recursion;
class Subset {
    public static void subset(String str,String curr,int currlen)
    {
        if (currlen == str.length())
        {
           System.out.println(curr+" ");
           return;
        }
        subset(str,curr,currlen+1);
        subset(str,curr+str.charAt(currlen),currlen+1);
    }
    public static void main(String arg[]) {
     subset("abc","",0);
    }
}





//Hi,
//        This is to inform you that I had put a complaint in South Bihar State Power Distribution Company Ltd







