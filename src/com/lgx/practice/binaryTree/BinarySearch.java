package com.lgx.practice.binaryTree;

public class BinarySearch {
	
	public static int binarySearch(int []a,int value) {
		int start = 0;
		int end = a.length - 1;
		int mid = 0;
		while(start < end) {
			mid = (start + end)/2;
			if(a[mid] > value) {
				end = mid - 1;
			}else if(a[mid] < value) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String []args) {
		int a[] = {12,34,6,7,8,90,54,3};
		int index = binarySearch(a,7);
		System.out.println(index);
	}
}
