package projeto.software.impressora;

public abstract class Impressora {
    protected Papel papel;
    protected double tempoDeImpressao;
    protected int numeroDePaginas;

    public Impressora(Papel papel, double tempoDeImpressao) {
        this.papel = papel;
        this.tempoDeImpressao = tempoDeImpressao;
        this.numeroDePaginas = 0;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }

    public void setTempoDeImpressao(int tempoDeImpressao) {
        this.tempoDeImpressao = tempoDeImpressao;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public abstract double imprimir();
}
