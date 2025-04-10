package TareaInvestigacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NombreClaseTest {

	  @Test

	    public void testSumar() {

	        Calculadora calc = new Calculadora();

	        assertEquals(5, calc.sumar(2, 3)); // 2 + 3 = 5

	    }
	  @Test

	  public void testSumarConNegativos() {

	      Calculadora calc = new Calculadora();

	      assertEquals(-1, calc.sumar(2, -3)); // 2 + (-3) = -1

	  }

	   

	  @Test

	  public void testSumarConCero() {

	      Calculadora calc = new Calculadora();

	      assertEquals(10, calc.sumar(10, 0)); // 10 + 0 = 10

	  }
	}



