package hw3;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangle_problemTest {
	private triangle_problem tri;

	@Test
	public void testequilateral() {
		tri = new triangle_problem();
		
		assertEquals("the trangle is equilateral",tri.triangle_juidje(3,3,3));
	}
	@Test
	public void testisosceles() {
		tri = new triangle_problem();
		assertEquals("the trangle is isosceles",tri.triangle_juidje(2,3,2));
	}
	@Test
	public void testscalene() {
		tri = new triangle_problem();
		assertEquals("the trangle is scalene",tri.triangle_juidje(2,3,4));
	}
	@Test
	public void testnottrangle() {
		tri = new triangle_problem();
		assertEquals("the three edges can't make up a trangle!",tri.triangle_juidje(2,3,5));
	}

}
