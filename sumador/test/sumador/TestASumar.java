package sumador;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestASumar {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		fail("No implementado aun");
	}

	 public void testUnaCifra() {
	        ASumar sumi = new ASumar();
	        String resultado = sumi.mostrar("5");
	        assertEquals("5 = 5",resultado );
	    }
}
