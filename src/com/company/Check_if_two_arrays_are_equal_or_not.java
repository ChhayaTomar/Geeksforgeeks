package com.company;

import java.util.HashMap;
import java.util.Map;

public class Check_if_two_arrays_are_equal_or_not {
    public static void main(String[] args) {
        int N = 5;
        long A[] = {1,2,5,4,0};
        long B[] = {2,4,5,0,1};
        System.out.println(check(A,B,N));
    }
    public static boolean check(long A[],long B[],int N) {
        HashMap<Long,Integer> hmap=new HashMap<>();
        for (int i = 0; i <N ; i++) {
            if(hmap.containsKey(A[i])){
                hmap.put(A[i],hmap.get(A[i])+1);
            }else{
                hmap.put(A[i],1);
            }
        }

        for (int i = 0; i <N ; i++) {
            if (hmap.containsKey(B[i])){
                hmap.put(B[i],hmap.get(B[i])-1);
            }
        }
        int i=0;
        for(Map.Entry<Long,Integer> entry : hmap.entrySet()) {
            if(entry.getValue()!=0) return false;
        }
        return true;
    }
}
