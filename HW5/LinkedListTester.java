import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class LinkedListTester{
	@Test
	public void firstTest(){
		LinkedList<Integer> i = new LinkedList<>();
		i.add(9);

		assertEquals(i.get(0), new Integer(9));
	}

	@Test
	public void secondTest(){
		LinkedList<Integer> i = new LinkedList<>();
		i.add(11);
		i.add(18);
		assertEquals(i.contains(11), true);
	}

	@Test
	public void thirdTest(){
		LinkedList<Integer> i = new LinkedList<>();
		i.add(11);
		i.add(18);
		i.add(49);
		i.add(71, 1);
		assertEquals(i.get(1), new Integer(71));
	}

	@Test
	public void fourthTest(){
		LinkedList<Integer> i = new LinkedList<>();
		i.add(49);
		i.add(54);
		i.add(92);
		assertEquals(i.indexOf(92), 1);
	}

	@Test
	public void fifthTest(){
		LinkedList<Integer> i = new LinkedList<>();
		i.add(70);
		i.add(45);
		Iterator<Integer> itr = new Iterator<>(i);
		assertEquals(itr.hasNext(), true);
	}

	@Test 
	public void sixthTest(){
		LinkedList<Integer> i = new LinkedList<>();
		i.add(43);
		i.add(62);
		Iterator<Integer> itr = new Iterator<>(i);
		assertEquals(itr.hasPrior(), false);
	}
}