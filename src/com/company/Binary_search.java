package com.company;

public class Binary_search {
    public static void main(String[] args) {
        int n=5;
        int[] arr={11,22,33,44,55};
        int k=445;
        System.out.println(binarySearch(arr,n,k));
    }
    public static int binarySearch(int arr[], int n, int k) {
        // code here
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==k) return mid;
            if(arr[mid]>k) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}
