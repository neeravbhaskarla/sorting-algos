package javaProjects;

public class Sort {
	
	public void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[minIndex] = temp;
		}
	}
	
	private static void merge(int arr[], int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] l1 = new int[n1];
		int[] l2 = new int[n2];
		
		for(int i=0; i<n1; i++) {
			l1[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			l2[j] = arr[m+j+1];
		}
		
		int i=0, j=0;
		int k = l;
		while(i<n1 && j<n2) {
			if(l1[i]<l2[j]) {
				arr[k] = l1[i];
				i++;
			}
			else {
				arr[k] = l2[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k] = l1[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = l2[j];
			j++;
			k++;
		}
	}
	private static void msort(int arr[], int l, int r) {
		if(l<r) {
			int m = l+(r-l)/2;
			msort(arr, l, m);
			msort(arr, m+1, r);
			merge(arr, l, m, r);
		}
	}
	
	public void mergeSort(int[] arr) {
		msort(arr, 0, arr.length-1);
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low; j<high; j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return i+1;
	}
	private static void qsort(int[] arr, int low, int high) {
		if(low<high) {
			int pivot = partition(arr, low, high);
			qsort(arr, low, pivot-1);
			qsort(arr, pivot+1, high);
		}
	}
	
	public void quickSort(int[] arr) {
		qsort(arr, 0, arr.length-1);
	}
	
	public void print(int[] arr) {
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
}
