import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	private static final int HUNDRED = 100;
	Car car;
	private int fifty = 50;
	
	@Before
	public void setUp() throws Exception{
		car = new Car(HUNDRED);
	}
	@Test
	public void testCar() {
		Car x = new Car(50);
		assertFalse(car.equals(x));
		
		Car y = new Car(100);
		assertTrue(car.equals(y));	}

	@Test
	public void testEqualsCar() {
		Car x = new Car(50);
		assertFalse(car.equals(x));
		
		Car y = new Car(100);
		assertTrue(car.equals(y));
	}

	@Test
	public void testEqualsObject() {
		Object x = new Car(HUNDRED);
		boolean expected = true;
		boolean actual = car.equals(x);
		assertEquals(expected, actual);
		
		String y = new String("Bogus car");
		assertEquals(false, y.toString());
		assertFalse(car.equals(y));
	}
	@Test
	public void tester() {
		String expected =  "40";
		String actual = Integer.toString(fifty);
		System.out.println(fifty);
	}
	@Test
	public void testToString() {
		//Stick to stringent government requirements
		//About a product information
		String expected = "This vehicle has a range of 100 miles";
		String actual = car.toString();
		assertEquals(expected,actual);
		fail("Not yet implemented");
		
		Car evCar = new Car(70);
		expected = "This vehicle has a range of 700 miles";
		actual = evCar.toString();
		assertEquals(expected,actual);
	}
	@Test
	public void testMilesToGo() {
		int milesDriven = 10;
		int expected = 90;
		int actual = car.milesToGo(milesDriven);
		assertEquals(expected, actual);
	}

}
