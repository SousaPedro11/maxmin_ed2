package guloso.tsp.util;

import java.util.ArrayList;

import guloso.tsp.Cidade;
import guloso.tsp.Rota;
import guloso.tsp.VizinhoMaisProximo;

public final class Utilitario {

    private Utilitario() {

    }

    public static String printaSeparador() {

        final StringBuilder sb = new StringBuilder();
        final int numSeparadores = 195;
        for (int i = 0; i < numSeparadores; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public static void imprimeMenoresRotas(final Rota menorRota) {

        System.out.println(Utilitario.printaSeparador());
        System.out.println("Caminho mais curto até agora: " + VizinhoMaisProximo.menorRota);
        System.out.println("Distancia total: " + String.format("%.3f", menorRota.calculaDistanciaTotal()) + " Km");
        System.out.println();
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