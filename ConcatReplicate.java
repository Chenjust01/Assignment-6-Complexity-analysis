/**
 * 
 */
package assignment;

/**
 * @author Justin
 *
 */
public class ConcatReplicate {
	
  public static String concatAndReplicateAll(String[] arr, int n) {
	  int length = arr.length;
	  String result = new String("");
	  String [] temp = new String [length*n]; 
	  int count = 0;
	  if(arr.length <= 0) {
		  throw new IllegalArgumentException("Cannot have an empty array");
	  } else {
		  
	  
	    for(int i = 0; i < n; i++) { 
		    for(int j = 0; j < n; j++) {
			    temp [count] = arr[i];
			    count++;
		    }	 
	    }
	  
	    for(int i = 0; i < temp.length; i++) {
		    result += temp[i];
	    }
	    return result;
	    }
  }
  
}
