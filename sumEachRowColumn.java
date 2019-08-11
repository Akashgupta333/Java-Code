
public class sumEachRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
        	int rowSum = 0;
        	for(int j=0;j<a[0].length;j++){
        		rowSum = rowSum + a[i][j];
        	}
        	System.out.println(rowSum);
        }
        for(int i=0;i<a[0].length;i++){
        	int colSum = 0;
        	for(int j=0;j<a.length;j++){
        		colSum = colSum + a[j][i];
        	}
        	System.out.println(colSum);
        }
	}

}
