
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int brr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        int sum[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		sum[i][j] = arr[i][j] + brr[i][j];
        	}
        }
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		System.out.print(sum[i][j]+" " );
        	}
        	System.out.println();
	    }
	}
}
