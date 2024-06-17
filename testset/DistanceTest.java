import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceTest {

	@Test(expected=IllegalArgumentException.class)
	public void testX1TooSmall() {
		Distance.distance(-100, 75.1652, 21.3069, 157.8583);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testX1TooLarge() {
		Distance.distance(100, 75.1652, 21.3069, 157.8583);
	}


	@Test(expected=IllegalArgumentException.class)
	public void testY1TooSmall() {
		Distance.distance(75.1652, -200, 21.3069, 157.8583);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testY1TooLarge() {
		Distance.distance(75.1652, 200, 21.3069, 157.8583);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testX2TooSmall() {
		Distance.distance(21.3069, 157.8583, -100, 75.1652);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testX2TooLarge() {
		Distance.distance(21.3069, 157.8583, 100, 75.1652);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testY2TooSmall() {
		Distance.distance(21.3069, 157.8583, 75.1652, -200);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testY2TooLarge() {
		Distance.distance(21.3069, 157.8583, 75.1652, 200);
	}

	@Test()
	public void testRandom(){
		assertEquals(1327.413810695487, Distance.distance(30, -30, 45, -45), 0.0001);

	}

	@Test()
	public void testX1SmallBoundary() {
		assertEquals(6261.194158604458, Distance.distance(-90, 0, 0, 0), 0.0001);
	}

	@Test()
	public void testX1LargeBoundary() {
		assertEquals(6261.194158604458, Distance.distance(90, 0, 0, 0), 0.0001);
	}

	@Test()
	public void testY1SmallBoundary() {
		assertEquals(12522.388317208915, Distance.distance(0, -180, 0, 0), 0.0001);
	}

	@Test()
	public void testY1LargeBoundary() {
		assertEquals(12522.388317208915, Distance.distance(0, 180, 0, 0), 0.0001);
	}

	@Test()
	public void testX2SmallBoundary() {
		assertEquals(6261.194158604458, Distance.distance(0, 0, -90, 0), 0.0001);
	}

	@Test()
	public void testX2LargeBoundary() {
		assertEquals(6261.194158604458, Distance.distance(0, 0, 90, 0), 0.0001);
	}

	@Test()
	public void testY2SmallBoundary() {
		assertEquals(12522.388317208915, Distance.distance(0, 0, 0, -180), 0.0001);
	}

	@Test()
	public void testY2LargeBoundary() {
		assertEquals(12522.388317208915, Distance.distance(0, 0, 0, 180), 0.0001);
	}






}
