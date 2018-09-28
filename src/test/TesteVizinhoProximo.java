package test;

import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.Test;

import tsp.vizinhomaisproximo.Cidade;
import tsp.vizinhomaisproximo.VizinhoMaisProximo;
import tsp.vizinhomaisproximo.util.Utilitario;

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

    @Test()
    public void TSPMenorRota() {

        Utilitario.imprimeMenoresRotas(new VizinhoMaisProximo().encontraMenorRota(TesteVizinhoProximo.cidadesIniciais, null));
        // System.out.println(Rota.distanciaInicioFim);
        System.out.println("\n");
    }

    @Test
    public void rotaAcara() {

        final String input = "Acará - PA";

        Utilitario.imprimeMenoresRotas(
                        new VizinhoMaisProximo().encontraMenorRota(TesteVizinhoProximo.cidadesIniciais,
                                        TesteVizinhoProximo.cidadesIniciais
                                                        .get(Utilitario.procuraIndice(input, TesteVizinhoProximo.cidadesIniciais))));
        // System.out.println(Rota.distanciaInicioFim);
    }

    @Test
    public void rotaSalvador() {

        final String input = "Salvador - BA";

        Utilitario.imprimeMenoresRotas(
                        new VizinhoMaisProximo().encontraMenorRota(TesteVizinhoProximo.cidadesIniciais,
                                        TesteVizinhoProximo.cidadesIniciais
                                                        .get(Utilitario.procuraIndice(input, TesteVizinhoProximo.cidadesIniciais))));
        // System.out.println(Rota.distanciaInicioFim);
    }

    @Test
    public void rotaGaranhuns() {

        final String input = "Garanhuns - PE";

        Utilitario.imprimeMenoresRotas(
                        new VizinhoMaisProximo().encontraMenorRota(TesteVizinhoProximo.cidadesIniciais,
                                        TesteVizinhoProximo.cidadesIniciais
                                                        .get(Utilitario.procuraIndice(input, TesteVizinhoProximo.cidadesIniciais))));
        // System.out.println(Rota.distanciaInicioFim);
    }

    @Test
    public void rotaBelém() {

        final String input = "Belém - PA";

        Utilitario.imprimeMenoresRotas(
                        new VizinhoMaisProximo().encontraMenorRota(TesteVizinhoProximo.cidadesIniciais,
                                        TesteVizinhoProximo.cidadesIniciais
                                                        .get(Utilitario.procuraIndice(input, TesteVizinhoProximo.cidadesIniciais))));
        // System.out.println(Rota.distanciaInicioFim);
    }
}
