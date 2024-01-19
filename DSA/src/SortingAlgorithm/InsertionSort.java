package SortingAlgorithm;

public class InsertionSort {
	public static void main(String[] args) {
		 int arr[] = {38,52,9,18,6,62,13};
		 
		 for(int i =1; i< arr.length;i++) {
			 int temp = arr[i];
			int j = i;
			while(j > 0 && temp < arr[j-1]) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
			 
		 }
		 
		 for(int i =0; i< arr.length;i++) {
			 System.out.print(arr[i] +" ");
		 }
	}

}
