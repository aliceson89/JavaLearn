import java.math.BigDecimal;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		//int value1; 
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The local variable value1 may not have been initialized
		//System.out.println(value1);
		
		//Declaration
		int value1; 
		//initialize
		value1 = 1; 
		System.out.println(value1);
		//Declaration and initialize
		int value2 =2, value3 = 3; 
		System.out.println(value3);
		
		//operation is possible 
		int value4 = (2*2)-1;
		System.out.println(value4);
		
	
		int value5 = (2*2)-value1;
		System.out.println(value5);
		int value6 = value1*value2*value2;
		System.out.println(value6);
		
        //be careful : out of range
		int max = 2147483647;
		int min = -2147483648; 
		short shortMax = 32767;
		short shortMin = -32768;
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		byte byteMax = 127;
		byte byteMin = -128;
		
		
		int a = 9; 
		float b = 9;
		double c = 9; 
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		int d = 9/2; 
		float e = 10f/6f;
		double g = 10d/6d; 
		System.out.println("a = " + d);
		System.out.println("b = " + e);
		System.out.println("c = " + g);
		
		int marker = 100;
		double percentage = marker * 0.46f; 
		System.out.println("percentage: " + percentage);
		
		boolean var = true; 
		System.out.println("var: " + var);
		
		char var1= '\u00AE'; 
		System.out.println("var1: " + var1);
		
		
		double x = 1.05; 
		double y = 2.55; 
		System.out.println(x+y);
		//result : 3.5999999999999996
		BigDecimal d1 = new BigDecimal(1.05); 
		BigDecimal d2 = new BigDecimal(2.55);
		System.out.println(d1.add(d2));
		//result 3.5999999999999998667732370449812151491641998291015625
		
		BigDecimal d3 = new BigDecimal("1.05"); 
		BigDecimal d4 = new BigDecimal("2.55");
		System.out.println(d3.add(d4));
		//result 3.60
		
		String string = "Hello World"; 
		System.out.println(string);
		
		//Unicode symbol
		String symbol = "\u00BB";
		System.out.println(symbol);
		String var2 = "10";
		// error : int cannot stored in String type - String var2 = 10; 
		String var3 = "20";
		int var4 = 10; 
		System.out.println(var2+var3);
		//result : 1020
		
		System.out.println(var3+var4);
		//result : 2010
		System.out.println(var4+20+"hi");
		//declaration String
		String var5 = new String("hello World!"); 
		System.out.println(var5);
		
		
		short shortdata = 5; 
		int intdata = shortdata; 
		System.out.println(intdata);
		//result : 5 
		int intdata2 = 10; 
		//short shortdata2 = intdata2; 
		//error : type mismatch 
		//narrowing casting : explicit casting
		short shortdata2 = (short)intdata2; 
		System.out.println(shortdata2);
		//result : 10
		shortdata2 = (byte)intdata2;
		System.out.println(shortdata2);
		//result : 10
		
		float floatdata = 10.0f;
		double doubledata = floatdata;
		System.out.println(doubledata);
		//result : 10.0
		
		double doubledata2 = 20.0123456789d;
		//float floatdata2 = doubledata2;
		//error : type mismatch 
		float floatdata2 = (float)doubledata2;
		System.out.println(floatdata2);
		//result : 20.012346 (truncated) - lost some information 
		

		//String string1 = "10"; 
		//error : int intdata_string = (int)string1;
		// Can not casting 
		
		float x1 = 10.0f; 
		int y1 = (int)x1;
		System.out.println(y1);
		//result : 10
		int x2 = 10; 
		float y2 = x2; 
		System.out.println(y2);
		//result : 10.0
		
		
		int i = 10;
		float f1 = i;
		System.out.println(f1);
		//result : 10.0 
		
		long longdata = 10l;
		float f2 = longdata; 
		System.out.println(f2);
		//result : 10.0
		
		float f3 = 10.0f; 
		//error : long longdata2 = f3;
		long longdata2 =(long)f3;
		System.out.println(longdata2);
		//result : 10 
		
		float f4 = 10.532f; 
		long longdata3 = (long)f4;
		System.out.println(longdata3);
		//result : 10 
	
		
		
		
		
		
		
		

	}

}
