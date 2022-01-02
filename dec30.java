package dec30;

public class dec30 {
	
	//_________________________[1st problem]______________________________________***
	static int power(int x,int y) {
		if(y==0) {
			return 1;
		}else if(y%2==0) {
			return power(x, y/2)*power(x, y/2);
			
		}else {
			return x*power(x,y/2);
		}
	}
//________________[2nd problem]_______________________________________________________***
// GCD of two number
	
	static int gcd(int a,int b) {
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if(a==b) {
			return a;
		}
		if(a>b) {
			return gcd(a-b,b);
		}else {
			return gcd(a, b-a);
		}
	}
	
//______________________________________________________________________________________***

	
	public static void main(String[] args) {
		int x=4;
		int y=2;
		
		System.out.println(power(x, y));

//_______________________________________________________________________________________***
		int a=34;
		int b=54;
		
		System.out.println("GCD of   "+a+" and "+b +" is "+gcd(a, b));
		
		

		
		

	}

}
