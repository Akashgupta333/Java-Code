package ArthimeticOperation;

public class totalGuestsPresentInParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5;
        int arr[] = {1,0,2,3,1};
        int count = 0;
        for(int i=0;i<n;i++){
        	if(arr[i]<=count){
        		count++;
        	}
        }
        System.out.println(count);
	}

}
