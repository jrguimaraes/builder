public class Pneu {

    private int largura;
    private int altura;
    private String tipoConstrucao;
    private int diametroAro;
    private int indiceCarga;
    private int indiceVelocidade;

    public Pneu() {
        this.largura = 0;
        this.altura = 0;
        this.diametroAro = 0;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getTipoConstrucao() {
        return tipoConstrucao;
    }

    public void setTipoConstrucao(String tipoConstrucao) {
        this.tipoConstrucao = tipoConstrucao;
    }

    public int getDiametroAro() {
        return diametroAro;
    }

    public void setDiametroAro(int diametroAro) {
        this.diametroAro = diametroAro;
    }

    public int getIndiceCarga() {
        return indiceCarga;
    }

    public void setIndiceCarga(int indiceCarga) {
        this.indiceCarga = indiceCarga;
    }

    public int getIndiceVelocidade() {
        return indiceVelocidade;
    }

    public void setIndiceVelocidade(int indiceVelocidade) {
        this.indiceVelocidade = indiceVelocidade;
    }
}
