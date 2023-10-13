package projeto.software.impressora;

public class ImpressoraTinta extends Impressora {
    public ImpressoraTinta(Papel papel, double tempoDeImpressao) {
        super(papel, tempoDeImpressao);
    }

    @Override
    public double imprimir() {
        double tempoDeImpressaoPorFolha;

        if (this.papel.getTempoDeImpressao() > this.tempoDeImpressao) {
            tempoDeImpressaoPorFolha = this.papel.getTempoDeImpressao();
        } else {
            tempoDeImpressaoPorFolha = this.tempoDeImpressao;
        }

        return this.numeroDePaginas * tempoDeImpressaoPorFolha;
    }
}
