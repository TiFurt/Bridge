package projeto.software.impressora;

public class ImpressoraJato extends Impressora {
    public ImpressoraJato(Papel papel, double tempoDeImpressao) {
        super(papel, tempoDeImpressao);
    }

    @Override
    public double imprimir() {
        return this.numeroDePaginas * this.tempoDeImpressao;
    }
}
