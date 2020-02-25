package assign1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleListTest {
	//test the empty list, is it null or not
	@Test
	public void testlist1() {
		SimpleList list =  new SimpleList();
		assertNotNull (list);
	}
	
	//test the empty list, does it contain valid element or not
	@Test
	public void testlist2() {
		SimpleList list =  new SimpleList();
		assertEquals (list.count(), 0);
	}
	
	//test method add method one time
	@Test
	public void testadd() {
		SimpleList list =  new SimpleList();
		list.add(2);
		
		assertEquals (list.count, 1);
	}
	
	//test add with multiple times
	@Test
	public void testAddMultipleElementandCount() {
		SimpleList list =  new SimpleList();
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(8);
		assertEquals (list.count(), 4);
	}
	
	//test add with multiple times and search method
	@Test
	public void testaddmultipleElement2andSearch() {
		SimpleList list =  new SimpleList();
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(8);
		assertEquals (list.search(9), 1);
	}
	
	//test search with an input which is not exist in list
	@Test
	public void testSearch() {
		SimpleList list =  new SimpleList();
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(8);
		assertEquals (list.search(5), -1);
	}
	
	//remove an element in list and check by using search
	@Test
	public void testremove() {
		SimpleList list =  new SimpleList();
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(8);
		list.remove(9);
		assertEquals (list.search(9), -1);
	}
	
	//test remove with an input that is not in list
	@Test
	public void testremove1() {
		SimpleList list =  new SimpleList();
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(8);
		list.remove(6);
		assertEquals (list.count, 4);
	}
	
	//remove an element and check the count number
	@Test
	public void testremove2() {
		SimpleList list =  new SimpleList();
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(8);
		list.remove(5);
		assertEquals (list.count, 4);
	}
	
	//test display after removing
	@Test
	public void testdisplay() {
		SimpleList list =  new SimpleList();
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(8);
		list.remove(9);
		
		assertEquals (list.toString(), " 8 4 2");
	}
	
	
	//display empty array
	@Test
	public void testdisplay3() {
		SimpleList list =  new SimpleList();
		
		
		assertEquals (list.toString(), "");
	}
	
	//removing and then adding the same element
	@Test
	public void test() {
		SimpleList list =  new SimpleList();
		list.add(2);
		list.add(4);
		list.add(9);
		list.add(8);
		list.remove(9);
		list.add(9);
		
		assertEquals (list.toString(), " 9 8 4 2");
	}
	
	//count empty list
	@Test
	public void testCount() {
		SimpleList list =  new SimpleList();
		
		
		assertEquals (list.count, 0);
	}
	
	
}
