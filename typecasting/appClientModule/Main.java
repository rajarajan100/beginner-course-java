
public class Main {
	public static void main(String[] args) {
	//float x=10.0f;
	//int y = (int)x;
	//System.out.println(y);
	//Float is explicitly converted to int.
//-------------	
		//int i=10;
		//float f =i;
		//System.out.println(f);
	//implicit conversion of any int type(byte,long,short) to float possible
//--------------
	//float f=20.0f;
		//long l=f;
		//System.out.println(l);
		//the implicit conversion of float to any int type is not possible only explicit 
		//conversion is possible 
//-----------
		//short s=10;
		//int i=s;
		//System.out.println(i);
		//output:10
//--------------
		//int i=10;
		//short s=i;
		//System.out.println(s);
		//Error
        //solution explicit conversion is needed
//--------------
		//similarly float can be converted to double implicitly 
		//but vice versa is possible only with explicit conversion.
//------------	
	    //the value must be inside the max and min value of data type 
	    //for the implicit conversion to be performed
//----------
		//in the conversion of double to float if the double value is larger than the float 
		//max value then the value get truncated
//----------
		//String s="10";
		//int i=(int)s;
		//System.out.println(i);
		//compile time error
//----------
		
		
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	

}