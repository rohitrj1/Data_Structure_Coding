package SortingAlgorithm;

public class BubbleSort {
	
	public static void main(String[] args) {
		 int arr[] = {38,52,9,18,6,62,13};
		 
		 for(int i = 0;i < arr.length;i++) {
			 int flag = 0;
			 for(int j = 0;j<arr.length-1-i;j++) {
				 if(arr[j] > arr[j +1]) {
					 int temp  = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
					 flag = 1;
				 }
				 for(int k = 0;k < arr.length;k++) {
					 System.out.print(arr[k] +" ");
				 }
				 System.out.println("  Round " + i);
			 }
			 if(flag == 0) break;
		
		 }
		 
//		 for(int i = 0;i < arr.length;i++) {
//			 System.out.print(arr[i] +" ");
//		 }
	}

}
