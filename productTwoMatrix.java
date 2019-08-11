
public class productTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int b[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int rows = a.length;
        int cols = a[0].length;
        int rows1 = b.length;
        int cols1 = b[0].length;
        if(cols!=rows1){
        	System.out.println("Not Multiplied");
        }
        else{ 
        	int prod[][] = new int[rows][cols1];    
      for(int i = 0; i < rows; i++){  
          for(int j = 0; j < cols1; j++){  
              for(int k = 0; k < rows1; k++){  
                 prod[i][j] = prod[i][j] + a[i][k] * b[k][j];   
              }  
          }  
      } 
        
        
      System.out.println("Product of two matrices: ");  
      for(int i = 0; i < rows; i++){  
          for(int j = 0; j < cols1; j++){  
             System.out.print(prod[i][j] + " ");  
          }  
          System.out.println();  
      }
        }
	}
}
	
        
