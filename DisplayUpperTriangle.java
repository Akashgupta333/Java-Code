
public class DisplayUpperTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = a.length;
        int cols = a[0].length;
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		if(i>j){
        			System.out.print(0+ " ");
        		}
        		else{
        			System.out.print(a[i][j]+ " ");
        		}
        	}
        	System.out.println();
        }
	}

}
