
public class TwoMatrixEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = a.length;
        int cols = a[0].length;
        boolean flag = true;
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		if(a[i][j] != b[i][j]){
        		   flag = false;
        		}
        	}
        }
        if(flag)
            System.out.println("Equal");
        else
        	System.out.println("Not Equal");
	}

}