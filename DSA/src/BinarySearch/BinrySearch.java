package BinarySearch;

public class BinrySearch {
	
	public static boolean binarySerach(int arr[] , int target) {
		int st = 0;
		int end = arr.length;
		while(st<=end) {
			
			int mid  = (st + end)/2;
			
			if(target == arr[mid]) {
				return true;
			}else if(target < mid) {
				end = mid -1;
			}else {
				st = mid +1;
			}
		}
		return false;
	}

	public static boolean recBinarySearch(int arr[],int st, int end,int target) {
		if(st > end) return false;
		
		int mid = (st + end)/2;
		
		if(target == arr[mid]) return true;
		else if(target < arr[mid])
			return recBinarySearch(arr, st, mid -1, target);
			
		return recBinarySearch(arr, mid +1 , end, target);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,3,5,7,8,10};   // binary search always works on sorted array. 
		int target = 7;
		
		System.out.printf("%d exist in array :  %b" , target, binarySerach(arr,target) );
		System.out.println();
		System.out.printf("%d exist in array :  %b" , target, recBinarySearch(arr,0,arr.length -1,target) );
		
		
	}

}
