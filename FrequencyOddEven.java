
public class FrequencyOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int oddCount = 0,evenCount = 0;
        for(int i=0;i<a.length;i++){
        	for(int j=0;j<a[0].length;j++){
        		if(a[i][j]%2==1){
        			oddCount++;
        		}
        		else{
        			evenCount++;
        		}
        	}
        }
        System.out.println(oddCount);
        System.out.println(evenCount);
	}

}
