
public class Sparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][] = {{1,2,0},{0,0,0},{4,5,0}};
        int count = 0;
        int rows = a.length;
        int cols = a[0].length;
        int size = rows * cols;
     
        for(int i=0;i<rows;i++){
        	for(int j=0;j<cols;j++){
        		if(a[i][j]==0){
        			count++;
        		}
        	}
        }
        if(count>size/2){
        	System.out.println("Sparse Matrix");
        }
        else{
        	System.out.println("Not Sparse Matrix");
        }
	}

}
