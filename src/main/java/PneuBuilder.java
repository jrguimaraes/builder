public class PneuBuilder {
    private Pneu pneu;

    public PneuBuilder() {
        pneu = new Pneu();
    }

    public Pneu build() {
        if (pneu.getLargura() == 0) {
            throw new IllegalArgumentException("Largura inválida");
        }
        if (pneu.getAltura() == 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
        if (pneu.getDiametroAro() == 0) {
            throw new IllegalArgumentException("Diâmetro de aro inválido");
        }
        return pneu;
    }

    public PneuBuilder setLargura(int largura) {
        pneu.setLargura(largura);
        return this;
    }

    public PneuBuilder setAltura(int altura) {
        pneu.setAltura(altura);
        return this;
    }

    public PneuBuilder setTipoConstrucao(String tipoConstrucao) {
        pneu.setTipoConstrucao(tipoConstrucao);
        return this;
    }

    public PneuBuilder setDiametroAro(int diametroAro) {
        pneu.setDiametroAro(diametroAro);
        return this;
    }

    public PneuBuilder setIndiceCarga(int indiceCarga) {
        pneu.setIndiceCarga(indiceCarga);
        return this;
    }

    public PneuBuilder setIndiceVelocidade(int indiceVelocidade) {
        pneu.setIndiceVelocidade(indiceVelocidade);
        return this;
    }
}
