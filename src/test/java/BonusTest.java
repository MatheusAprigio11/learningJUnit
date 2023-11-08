import org.example.Model.Aprendiz;
import org.example.Service.BonusService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusTest {

    @Test
    public void bonusDeveriaSerZero(){
        BonusService bonus = new BonusService();
        double aumento = bonus.calcularBonus(new Aprendiz("Aprigio", 3500));
        assertEquals(0, aumento, 0);
    }

    @Test
    public void bonusDeveriaSerDezPorcento(){
        BonusService bonus = new BonusService();
        double aumento = bonus.calcularBonus(new Aprendiz("Felicio", 900));
        assertEquals(90, aumento, 0);
    }

    @Test
    public void bonusDeveriaSerCem(){
        BonusService bonus = new BonusService();
        double aumento = bonus.calcularBonus(new Aprendiz("Julia Gabi", 1000));
        assertEquals(100,aumento,0);
    }

}
