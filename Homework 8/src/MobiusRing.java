
public class MobiusRing {
public static void main(String[] args) {
		System.out.println("\nPart 4:");                                     
		String s1 = "Hello", s2 = "Java";
		String[] strs = MobiusRing.mobius(s1, s2);
		for (String s : strs)
			System.out.println(s);
	}

	 public static String[] mobius(String s1, String s2){
		String mstring = s1 + s2;
		char [] marray = mstring.toCharArray();
		String [] s3 = new String [mstring.length()];
		int counter = 0;
		return mobius(marray, counter, s3 );
	 }
	public static String[] mobius( char[] marray, int counter, String [] s3){
		String d = new String(marray);
		s3[counter]= d;
		if(counter == marray.length-1){
			return s3;
		} else {
			char temp = marray[0];
			System.arraycopy(marray, 1, marray, 0, marray.length-1);
			marray[marray.length-1]= temp;
			return mobius(marray,counter+1, s3);
		}    
		
		 
			 
	}  
		}
		
				

