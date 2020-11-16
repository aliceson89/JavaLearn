
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 6; 
		// x != 5
		if( x == 5 ) {
			System.out.println("Value of x is 5");
		}else {
			System.out.println("what happend");
		}
		
		int y =4, z = 4; 
		
		if (y >= z) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if ((x < y) && ( x == y )) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		//result : Condition is FALSE
		
		if ((x < y) || ( x == y )) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		//result : Condition is FALSE
		if (!((x < y) || ( x == y ))) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		//result : Condition is TRUE
		
		boolean a = true; 
		boolean b = false;
		if (a && b) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		
		// result : Condition is FALSE
		if (a || b) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		// result : Condition is TRUE
		
		if (true && false) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		// result : Condition is FALSE
		if (true || true) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		// result : Condition is TRUE
		if (false || true) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		// result : Condition is TRUE
		
		if (false || false) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		// result : Condition is FALSE
		
		
		if (!false){
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		// result : Condition is TRUE
		
		int ageOfBoy = 23; 
		int ageOfGirl = 20; 
		
		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)){
			System.out.println("ready to get married");
		}else {
			System.out.println("wait for it kiddo!");
		}
		
		//ready to get married
		
		ageOfBoy = 13; 
		ageOfGirl = 20; 
		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)){
			System.out.println("ready to get married");
		}else {
			System.out.println("wait for it kiddo!");
		}
		// wait for it kiddo!
		
		int temp = 5; 
	    if (temp == 5) {
	    	if (temp>5) {
	    		System.out.println("temp is greater than 5");
	    		
	    	}else {
	    		System.out.println("temp is smaller than 5");
	    	}
	    }
	    // result : temp is smaller than 5
	    
	    temp = 4; 
	    if (temp == 5) {
	    	System.out.println("temp is equal to 5");
	    }else if (temp > 5) {
	    	System.out.println("temp is greater than 5");
	    }else {
	    	System.out.println("temp is smaller than 5");
	    }
	    // result : temp is smaller than 5
	    temp =11; 
	    if (temp == 5) {
	    	System.out.println("temp is equal to 5");
	    }else if (temp > 5) {
	    	System.out.println("temp is greater than 5");
	    }else {
	    	System.out.println("temp is smaller than 5");
	    }
	    // result : temp is greater than 5
	}
}
