import org.example.Model.Aprendiz;
import org.example.Model.Desempenho;
import org.example.Service.ReajusteService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteTest {

    @Test
    public void reajusteDeveriaSerTresPorcento(){
        ReajusteService reajuste = new ReajusteService();
        Aprendiz aprendiz = new Aprendiz("Pedrinho", 1000);
        reajuste.concederReajuste(aprendiz, Desempenho.OTIMO);
        assertEquals(1300, aprendiz.getSalario(), 0);
    }

    @Test
    public void reajusteDeveriaSerQuinzePorcento(){

    }

    @Test
    public void reajusteDeveriaSerVintePorcento(){

    }





}
