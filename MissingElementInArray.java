package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

public static void main(String[] args) {
	
	int[] arr = {1, 2, 3, 4, 7, 6, 8};
	Arrays.sort(arr);
	int length = arr.length;
	
	for(int i = 0; i < length; i++) {
	int a = i + 1;
	if (a != arr[i]) {
		System.out.println("Missing number is "+a);
		break;
	}
	}
		
}
}
