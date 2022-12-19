package exercice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RobotTest {

	@Test
	public void avance(){
        Robot r1= new Robot("Optimus Prime");
        r1.avance();
        r1.avance();
        assertEquals(0,r1.getX());
        assertEquals(2,r1.getY());
        assertEquals("Nord",r1.getDirection());
	}
	@Test
	public void droite() {
		Robot r2= new Robot("Mégatron");
		r2.droite();
		r2.droite();
		assertEquals(0,r2.getX());
        assertEquals(0,r2.getY());
        assertEquals("Sud",r2.getDirection());
		}
	@Test
	public void getPosition() {
		Robot r3= new Robot("Bumblebee");
		r3.droite();
		r3.avance();
		r3.droite();
		r3.avance();
		r3.avance();
		
		assertEquals(1,r3.getX());
        assertEquals(-2,r3.getY());
        assertEquals("Sud",r3.getDirection());
		
	}
	}
	

 