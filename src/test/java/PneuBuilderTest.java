import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PneuBuilderTest {

    @Test
    void deveRetornarExcecaoParaPneuSemLargura() {
        try {
            PneuBuilder pneuBuilder = new PneuBuilder();
            Pneu pneu = pneuBuilder
                    .setAltura(70)
                    .setDiametroAro(14)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Largura inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPneuSemAltura() {
        try {
            PneuBuilder pneuBuilder = new PneuBuilder();
            Pneu pneu = pneuBuilder
                    .setLargura(170)
                    .setDiametroAro(14)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPneuSemDiametroAro() {
        try {
            PneuBuilder pneuBuilder = new PneuBuilder();
            Pneu pneu = pneuBuilder
                    .setLargura(170)
                    .setAltura(70)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Diâmetro de aro inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPneuValido() {
        try {
            PneuBuilder pneuBuilder = new PneuBuilder();
            Pneu pneu = pneuBuilder
                    .setLargura(170)
                    .setAltura(70)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Diâmetro de aro inválido", e.getMessage());
        }
    }
}