package test;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import guloso.tsp.Cidade;
import guloso.tsp.VizinhoMaisProximo;
import guloso.tsp.util.Utilitario;

public class TesteVizinhoProximo {

    private static final ArrayList<Cidade> cidadesIniciais = new ArrayList<>(Arrays.asList(
                    new Cidade("Acará - PA", -1.95383, -48.1985),// 9028,882 sem voltar
                    new Cidade("Belém - PA", -1.4554, -48.4898),// 9145,136 sem voltar
                    new Cidade("Salvador - BA", -12.9718, -38.5011),// 9425,681 sem voltar
                    new Cidade("Garanhuns - PE", -8.88243, -36.4966),// 9028,882 sem voltar
                    new Cidade("Florianópolis - SC", -27.5945, -48.5477),// 9206,440 sem voltar
                    new Cidade("Fortaleza - CE", -3.71664, -38.5423),// 9028,882 sem voltar
                    new Cidade("Diamantina - MG", -18.2413, -43.6031),// 9425,681 sem voltar
                    new Cidade("Petrópolis - RJ", -22.52, -43.1926),// 9206,440 sem voltar
                    new Cidade("Farroupilha - RS", -29.2227, -51.3419),// 9046,385 sem voltar
                    new Cidade("Oiapoque - AP", 3.84074, -51.8331)));// 9046,385 sem voltar

    /**
     * Teste de entrada aleatória, definida pela entrada null
     */
    @Test()
    public void TSPMenorRota() {

        Utilitario.imprimeMenoresRotas(new VizinhoMaisProximo()
                        .encontraMenorRota(TesteVizinhoProximo.cidadesIniciais, null));
        System.out.println("\n");
    }

    @Test
    public void rotaAcara() {

        final String input = "Acará - PA";

        this.calculaRota(input);
    }

    @Test
    public void rotaSalvador() {

        final String input = "Salvador - BA";

        this.calculaRota(input);
    }

    @Test
    public void rotaGaranhuns() {

        final String input = "Garanhuns - PE";

        this.calculaRota(input);
    }

    @Test
    public void rotaBelém() {

        final String input = "Belém - PA";

        this.calculaRota(input);
    }

    @Test
    public void rotaMarituba() {

        final String input = "Marituba - PA";

        this.calculaRota(input);
    }

    public void calculaRota(final String input) {

        final Integer procuraIndice = Utilitario.procuraIndice(input, TesteVizinhoProximo.cidadesIniciais);

        if (procuraIndice != null) {

            Utilitario.imprimeMenoresRotas(
                            new VizinhoMaisProximo()
                                            .encontraMenorRota(TesteVizinhoProximo.cidadesIniciais,
                                                            TesteVizinhoProximo.cidadesIniciais
                                                                            .get(procuraIndice)));
            System.out.println("");
        } else {
            VizinhoMaisProximo.imprimeListaInicial(TesteVizinhoProximo.cidadesIniciais, input);
            System.out.println("\"" + input + "\" não consta na lista!");
            System.out.println("\n");
        }
    }
}
