
public class CarDriver {
	public static void main(String[] args) {
		Car a = new Car(10);
		Car b = new Car(10);
		
		System.out.println("Range: " + b.toString());
		Car c = a;
		
		System.out.println(a == a);
		System.out.println(a == b);
		System.out.println(a == c);
		
		System.out.println(a.equals(a));
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println("Check with  a different object");
		System.out.println(a.equals(new String("10")));
		
		SuperCar x = new SuperCar(10);
		x.equals(a);
		System.out.println(x.equals(a));
		Car y = null;
		a.equals(y);
		System.out.println(a.equals(y));
		
		// look at 
		Car tesla = new SuperCar(250);
		tesla.toString();
		//tesla.impress();
		//SuperCar x = new Car(700);
		//x.impress();				
	}
}
