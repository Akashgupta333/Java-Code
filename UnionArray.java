package Demo;

public class UnionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {1,2,3,4,5,6,7,8,9};
        int b[] = {3,4,5,9};
        int i=0,j=0;
        while(i<a.length && j<b.length){
        	if(a[i]>b[j]){
        		System.out.print(b[j]+" ");
        		j++;
        	}
        	else if(b[j]>a[i]){
        		System.out.print(a[i]+" ");
        		i++;
        	}
        	else{
        		System.out.print(a[i]+" ");
        		i++;
        		j++;
        	}
        }
	}

}
