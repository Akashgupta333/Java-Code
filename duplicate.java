package Demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int a[]={1,2,3,4,5,4,5,1,2,6};
      HashMap<Integer,Integer> hm = new HashMap();
      for(int i=0; i<a.length ; i++) {
    	  if(hm.get(a[i]) == null) {
    		  hm.put(a[i], 1);
    	  }
    	  else {
    		  hm.put(a[i], hm.get(a[i])+1 );
    	  }
      }
      
      int min = Integer.MAX_VALUE;
      int sum = 0;
      for(Map.Entry <Integer, Integer> h:hm.entrySet()) {
    	  if((h.getValue() > 1) && (min > h.getKey())) {
    		  min = (int)h.getKey();
    	  }
    	  sum = sum + (int)h.getKey();
      }
      
      System.out.println(sum+min+1);
    }
}