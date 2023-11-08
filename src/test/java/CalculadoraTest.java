import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(2,2);
        assertEquals(soma, 3,0);

    }

}
