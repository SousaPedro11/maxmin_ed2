package tsp.vizinhomaisproximo.util;

import java.util.ArrayList;

import tsp.vizinhomaisproximo.Cidade;
import tsp.vizinhomaisproximo.Rota;
import tsp.vizinhomaisproximo.VizinhoMaisProximo;

public final class Utilitario {

    private Utilitario() {

    }

    public static String printaSeparador() {

        final StringBuilder sep = new StringBuilder();
        for (int i = 0; i < 73; i++) {
            sep.append("-");
        }
        return sep.toString();
    }

    public static void imprimeMenoresRotas(final Rota menorRota) {

        System.out.println(Utilitario.printaSeparador());
        System.out.println("Caminho mais curto até agora: " + VizinhoMaisProximo.menorRota);
        System.out.println("Distancia total: " + String.format("%.3f", menorRota.calculaDistanciaTotal()) + " Km");
    }

    public static Integer procuraIndice(final String input, final ArrayList<Cidade> array) {

        Integer indice = null;
        for (final Cidade cidade : array) {
            if (input.equalsIgnoreCase(cidade.getNome())) {
                indice = array.indexOf(cidade);
                break;
            }
        }
        return indice;
    }
}
