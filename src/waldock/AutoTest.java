package waldock;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class AutoTest {
	
	@Test
	public void testDefaultConstructor(){
		Auto a = new Auto();
		Assert.assertEquals("Constructor fail", "Ford", a.getType());
		Assert.assertEquals("Constructor fail", Color.RED, a.getFarbe());
		Assert.assertEquals("Constructor fail", 160, a.getLeistung());
	}
	
	@Test
	public void testSpecificConstructor(){
		Auto b = new Auto("BMW", Color.RED, 20);
		Assert.assertEquals("Constructor fail", "BMW", b.getType());
		Assert.assertEquals("Constructor fail", Color.RED, b.getFarbe());
		Assert.assertEquals("Constructor fail", 20, b.getLeistung());
		
	}
	
	@Test
	public void testType(){
		Auto a = new Auto();
		a.setType("VW");
		Assert.assertNotNull("Auto.type fail!", a.getType());
		Assert.assertEquals("Auto.type fail!", "VW", a.getType());
	}
	
	@Test
	public void testFarbe(){
		Auto a = new Auto();
		a.setFarbe(Color.BLUE);
		Assert.assertNotNull("Auto.farbe fail!", a.getFarbe());
		Assert.assertEquals("Auto.farbe fail!", Color.BLUE, a.getFarbe());
	}
	
	@Test
	public void testLeistung(){
		Auto a = new Auto();
		a.setLeistung(42);
		Assert.assertNotNull("Auto.leistung fail!", a.getLeistung());
		Assert.assertEquals("Auto.leistung fail!", 42, a.getLeistung());
	}
	
	@Test
	public void testAutoToString() {
		Auto a = new Auto();
		a.setFarbe(Color.BLACK);
		Assert.assertNotNull("Auto.toString fail!", a.toString());
		Assert.assertEquals("Auto.toString fail!", "Ford, schwarz, 160PS", a.toString());
	}
	
	@Test(expected=NullPointerException.class)
	public void testExecption() {
		Auto a = new Auto();
		a.setType(null);
	}
}
