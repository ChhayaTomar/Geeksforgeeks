package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse_array_in_groups {
    public static void main(String[] args) {
        int n=5;
        int k=3;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverseInGroups(arr,n,k);
        System.out.println(arr);
    }
    public static void reverseInGroups(ArrayList<Integer> arr,int n, int k){
        Stack<Integer> s = new Stack<>();
        int t = 0;
        int j=0;
        for(int i = 0;i<n;i++){
            s.push(arr.get(i));
            t++;
            while(!s.isEmpty() && (t == k || (i == n-1))){
                arr.set(j,s.pop());
                j++;

            }
            if( t== k){
                t = 0;
            }
        }
    }
}
