
public class Subtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][] = {{9,8,7},{6,5,4},{3,2,1}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = a.length;
        int cols = a[0].length;
        int sub[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		sub[i][j] = a[i][j] - b[i][j];
        	}
        }
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		System.out.print(sub[i][j] + " ");
        	}
        	System.out.println();
        }
	}

}
