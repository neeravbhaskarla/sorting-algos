package javaProjects;

public class MyClass {
	public static void main(String args[]) {
		Sort sort = new Sort();
		int[] arr = {8,7,6,5,4,3,2,1};
		sort.bubbleSort(arr);
		sort.print(arr);
		
		int[] arr1 = {8,7,6,5,4,3,2,1};
		sort.selectionSort(arr1);
		sort.print(arr1);
		
		int[] arr2 = {8,7,6,5,4,3,2,1};
		sort.mergeSort(arr2);
		sort.print(arr2);
		
		int[] arr3 = {8,7,6,5,4,3,2,1};
		sort.quickSort(arr3);
		sort.print(arr3);
		
	}
}
