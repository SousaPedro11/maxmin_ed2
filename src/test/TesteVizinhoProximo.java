package test;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import tsp.vizinhomaisproximo.Cidade;
import tsp.vizinhomaisproximo.Rota;
import tsp.vizinhomaisproximo.VizinhoMaisProximo;
import tsp.vizinhomaisproximo.util.Utilitario;

public class TesteVizinhoProximo {

    private static final ArrayList<Cidade> cidadesIniciais = new ArrayList<>(Arrays.asList(
                    new Cidade("Acará - PA", -1.95383, -48.1985),// 9028,882
                    new Cidade("Belém - PA", -1.4554, -48.4898),// 9145,136
                    new Cidade("Salvador - BA", -12.9718, -38.5011),// 9425,681
                    new Cidade("Garanhuns - PE", -8.88243, -36.4966),// 9028,882
                    new Cidade("Florianópolis - SC", -27.5945, -48.5477),// 9206,440
                    new Cidade("Fortaleza - CE", -3.71664, -38.5423),// 9028,882
                    new Cidade("Diamantina - MG", -18.2413, -43.6031),// 9425,681
                    new Cidade("Petrópolis - RJ", -22.52, -43.1926),// 9206,440
                    new Cidade("Farroupilha - RS", -29.2227, -51.3419),// 9046,385
                    new Cidade("Oiapoque - AP", 3.84074, -51.8331)));// 9046,385 / 12727,364 - 3680.979

    private void imprimeMenoresRotas(final Rota menorRota) {

        System.out.println(Utilitario.printaSeparador());
        System.out.println("Caminho mais curto até agora: " + VizinhoMaisProximo.menorRota);
        System.out.println("Distancia total: " + String.format("%.3f", menorRota.calculaDistanciaTotal()) + " Km");
    }

    private Integer procuraIndice(final String input) {

        Integer indice = null;
        for (final Cidade cidade : TesteVizinhoProximo.cidadesIniciais) {
            if (input.equalsIgnoreCase(cidade.getNome())) {
                indice = TesteVizinhoProximo.cidadesIniciais.indexOf(cidade);
                break;
            }
        }
        return indice;
    }

    @Test()
    public void TSPMenorRota() {

        this.imprimeMenoresRotas(new VizinhoMaisProximo().encontraMenorRota(TesteVizinhoProximo.cidadesIniciais, null));
        // System.out.println(Rota.distanciaInicioFim);
        System.out.println("\n");
    }

    @Test
    public void rotaBelém() {

        final String input = "Oiapoque - AP";

        this.imprimeMenoresRotas(
                        new VizinhoMaisProximo().encontraMenorRota(TesteVizinhoProximo.cidadesIniciais,
                                        TesteVizinhoProximo.cidadesIniciais.get(this.procuraIndice(input))));
        // System.out.println(Rota.distanciaInicioFim);
    }
}
