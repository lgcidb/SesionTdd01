package cl.ubb.agil;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {
	
	@Test
	public void SumarDosMasTresEsCinco(){
		
		/*Arrange*/
		Calculadora calculadora = new Calculadora();
		
		/*Act*/
		int result = calculadora.sumar(2, 3);
		
		/*Assert*/
		assertThat(result,is(5));
		
	}
}
