
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;


public class avltree_testing {
	
	
	private AvlTree avlt;
	private ByteArrayOutputStream output_console;
	
	private void console(){
		output_console = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output_console));
	}
	
	
	@Before
	public void setUp()throws Exception{
		avlt = new AvlTree();
		console();
	}
	
	
	@Test
	public void testcase_makeEmpty(){
		avlt.insert(1);
		avlt.makeEmpty();
		assertEquals("should be right",true,avlt.isEmpty());
		
		avlt.insert(2);
		assertEquals("should be right",false,avlt.isEmpty());
	}
	
	@Test
	public void testcase_insert(){
		avlt.insert(1);
		assertEquals("should be right",true,avlt.search(1));
		
		avlt.insert(2);
		assertEquals("should be right",false,avlt.search(3));
	}
	
	@Test
	public void testcase_isEmpty(){
		assertEquals("should be right",true,avlt.isEmpty());
		
		avlt.insert(1);
		assertEquals("should be right",false,avlt.isEmpty());
	}
	
	@Test
	public void testcase_search(){
		avlt.insert(1);
		avlt.insert(2);
		avlt.insert(3);
		assertEquals("should be finded",true,avlt.search(3));
		
		avlt.insert(1);
		avlt.insert(4);
		avlt.insert(5);
		assertEquals("should be right",false,avlt.search(6));
	}
	
	@Test
	public void testcase_countnode(){
		avlt.insert(1);
		avlt.insert(2);
		avlt.insert(3);
		assertEquals("should be counted",3,avlt.countNodes());
		
		avlt.insert(1);
		avlt.insert(4);
		avlt.insert(5);
		assertEquals("should be right",5,avlt.countNodes());
	}
	
	
	
	@Test
	public void testcase_post_order() throws Exception{
		avlt.insert(5);
		avlt.insert(3);
		avlt.insert(2);
		avlt.postorder();
		String ans = "2 5 3 ";		
		assertEquals(ans,output_console.toString());
	}
	
	@Test
	public void testcase_in_order() throws Exception{
		avlt.insert(6);
		avlt.insert(9);
		avlt.insert(8);
		avlt.inorder();
		String ans = "6 8 9 ";		
		assertEquals(ans,output_console.toString());
	}
	
	@Test
	public void testcase_pre_order() throws Exception{
		avlt.insert(6);
		avlt.insert(9);
		avlt.insert(8);
		avlt.preorder();
		String ans = "8 6 9 ";		
		assertEquals(ans,output_console.toString());
	}
	
	
	
	
}
