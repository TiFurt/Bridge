package projeto.software.impressora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpressoraTest {

    @Test
    void deveImprimirFolhaA4NaImpressoraJato() {
        ImpressoraJato impressoraJato = new ImpressoraJato(new PapelA4(), 0.5);
        impressoraJato.setNumeroDePaginas(10);
        assertEquals(5, impressoraJato.imprimir());
    }

    @Test
    void deveImprimirFolhaA5NaImpressoraJato() {
        ImpressoraJato impressoraJato = new ImpressoraJato(new PapelA5(), 0.3);
        impressoraJato.setNumeroDePaginas(10);
        assertEquals(3, impressoraJato.imprimir());
    }

    @Test
    void deveImprimirFolhaA4NaImpressoraTintaUsandoTempoDoPapel() {
        ImpressoraTinta impressoraTinta = new ImpressoraTinta(new PapelA4(), 0.5);
        impressoraTinta.setNumeroDePaginas(10);
        assertEquals(20, impressoraTinta.imprimir());
    }

    @Test
    void deveImprimirFolhaA4NaImpressoraTintaUsandoTempoDaImpressora() {
        ImpressoraTinta impressoraTinta = new ImpressoraTinta(new PapelA4(), 3);
        impressoraTinta.setNumeroDePaginas(10);
        assertEquals(30, impressoraTinta.imprimir());
    }

    @Test
    void deveImprimirFolhaA5NaImpressoraTintaUsandoTempoDoPapel() {
        ImpressoraTinta impressoraTinta = new ImpressoraTinta(new PapelA5(), 0.3);
        impressoraTinta.setNumeroDePaginas(10);
        assertEquals(10, impressoraTinta.imprimir());
    }

    @Test
    void deveImprimirFolhaA5NaImpressoraTintaUsandoTempoDaImpressora() {
        ImpressoraTinta impressoraTinta = new ImpressoraTinta(new PapelA5(), 3);
        impressoraTinta.setNumeroDePaginas(10);
        assertEquals(30, impressoraTinta.imprimir());
    }
}