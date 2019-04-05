/**
 * 
 */
package assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Justin
 *
 */
public class IntPair {
	  private int fst;
	  private int snd;
	  int size; 
	  public IntPair(int fst, int snd) {
	    this.fst = fst;
	    this.snd = snd;
	  } // IntPair(int,int)

	  public int getFst() { 
	    return fst; 
	  } // getFst()

	  public int getSnd() { 
	    return snd; 
	  } // getSnd()
	  
	  public String toString() {
		  return "(" + getFst() + ", " + getSnd() + ")";
	  }
	// N^2
	  public static IntPair[] allPairs(int[] arr) {
		 // NewKeywordExample obj = new NewKeywordExample();
		  IntPair myArr[] = new IntPair[(arr.length * arr.length)];
		  int x = 0;
		  if(arr.length == 0) {
			  throw new IllegalArgumentException();
		  } else {
		    for(int i = 0; i < arr.length;i++) {
		    	for(int j = 0; j < arr.length; j++) {
		    		myArr[x++] = new IntPair(arr[i],arr[j]);
		    	}
		    }
		  }
		  return myArr;
	  }
		
	 
	} // IntPair