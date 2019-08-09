import java.util.Arrays;

public class AlternativeSorting {
     static void alternateSort(int arr[],int n){
    	 Arrays.sort(arr);
    	 int i = 0, j = n-1; 
         while (i < j) { 
             System.out.print(arr[j] + " ");
             j--;
             System.out.print(arr[i] + " ");
             i++;
         }  
         if (n % 2 != 0) 
             System.out.print(arr[i]); 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]={1,2,4,3,8,5,6,9,7};
        int n=arr.length;
        alternateSort(arr, n);
	}

}
