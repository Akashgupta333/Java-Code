
public class rigthRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {1,2,3,4,5,6,7};
        int k = 3;
        for(int i=0;i<k;i++){
        	int temp = a[a.length-1];
        	
        	for(int j=a.length-1;j>0;j--){
        		a[j] = a[j-1];
        	}
        	a[0] = temp;
        }
        for(int i=0;i<a.length;i++){
        	System.out.println(a[i]);
        }
	}

}
