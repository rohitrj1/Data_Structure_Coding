package SortingAlgorithm;

public class SelectionSort {
	
	public static void main(String[] args) {
		 int arr[] = {38,52,9,18,6,62,13};
		 
		 for(int i = 0; i < arr.length;i++) {
			 int smallest = i;
			 for(int j = i + 1 ; j< arr.length;j++) {
				 if(arr[smallest] > arr[j])
					 smallest = j;
			 }
			 int temp = arr[i];
			 arr[i] = arr[smallest];
			 arr[smallest] = temp;
		 }
		 
		 for(int i = 0; i < arr.length;i++) {
			 System.out.print(arr[i] +" ");
		 }
	}

}
