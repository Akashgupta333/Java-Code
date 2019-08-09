package Demo;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int visited=-1;
		int a[]={1,2,3,4,5,6,4,1,2,5,4};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++){
			int count=1;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
					b[j]=visited;
				}
			}
			if(b[i]!=visited){
				b[i]=count;
			}
		
		}
		for(int i=0;i<b.length;i++){
			if(b[i]!=visited){
				System.out.println(a[i]+"  "+b[i]);
			}
		}
		System.out.println();
	}

}
