package sorting;

public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,7,6,1,8,4};
		for(int i =0;i<arr.length-1;i++) {
			int min = i;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min =j;
				}
				
			}
			int temp = arr[i];
			arr[i]= arr[min];
			arr[min]=temp;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
