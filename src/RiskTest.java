import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RiskTest {

    @Test
    void hello() {
        Risk risk = new Risk();
        assertEquals("Hello!",risk.hello());
    }
    @Test
    void RiskConstructorTest() {
        Risk risk1 = new Risk();
        assertEquals(0.001, risk1.getProbabilityPercent());
    }


    @Test
    void TestAll() {
        //Tester risikoen med case Anders

        Risk risk = new Risk();
        risk.setDescription("Bundkort i computer virker ikke");
        risk.setConsequence("Undervisningen kan ikke afholdes");
        risk.setProbabilityLevel(Probability.LOW);
        

        assertEquals("Bundkort i computer virker ikke", risk.getDescription());
        assertEquals("Undervisningen kan ikke afholdes", risk.getConsequence());
        assertEquals(Probability.LOW, risk.getProbabilityLevel());
        assertEquals(0.005, risk.getProbabilityPercent());
    }


}