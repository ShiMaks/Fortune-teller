package by.learning.divination.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import by.learning.divination.bean.Flower;

public class SimpleTestTeller {
	
private FortuneTeller teller;
	
	@Before
	public void init() {
		teller = new FortuneTeller();
	}

	@Test
	public void testFurtuneTellerVariantsNotNull() {
		assertNotNull("Telller was not properly initialized", teller.getPredictionsDictionary());
	}
	
	@Test
	public void testTellerVariantsGreaterMin() {
		teller.turnOn();
		Map<String, String[]> map = teller.getPredictionsDictionary();
		int realVariants = map.entrySet().size();
		assertEquals("Real preditions count less than min", teller.MIN_PREDICTIONS, realVariants);
	}
	
	@Test
	public void testTellerPredict() {
		boolean b = false;
		String word = "Car";
		teller.turnOn();
		Flower flower = new Flower("Chammomile");
		flower.bloom();
		String result = teller.predict(flower, "Car");
	    String[] map = teller.getPredictionsDictionary().get("Car");
	    Set<String> set = new HashSet<>();
	    set.add(map[0]);
	    set.add(map[1]);
	    set.add(map[2]);
	    set.add(map[3]);
	    boolean res = set.add(result);
	    assertEquals("Real preditions count less than min", b, res);
	}
	
	@Test
	

}
