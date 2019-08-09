public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {10, 3, 5, 6, 2};
         int sum[] = new int[arr.length];
         int s = 1,k=0;
         for(int i=0;i<arr.length;i++){
        	 for(int j=0;j<arr.length;j++){
        		 if(i==j){
        			 continue;
        		 }
        		 s=s*arr[j];
        	 }
        	 sum[k++] = s;
        	 s = 1;
         }
         for(int i=0;i<sum.length;i++){
        	 System.out.print(sum[i]+" ");	 
         }
	}
}