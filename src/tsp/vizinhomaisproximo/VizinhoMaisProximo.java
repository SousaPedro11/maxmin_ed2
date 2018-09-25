package tsp.vizinhomaisproximo;

import java.util.ArrayList;
import java.util.Arrays;

import tsp.vizinhomaisproximo.util.Utilitario;

public class VizinhoMaisProximo {

    public Rota encontraMenorRota(final ArrayList<Cidade> cidades) {

        final ArrayList<Cidade> cidadesMenorRota = new ArrayList<>(cidades.size());
        final String separador = Utilitario.printaSeparador();
        System.out.println(separador);
        System.out.println("Rota inicial        ==> " + Arrays.toString(cidades.toArray()));
        System.out.println("Distancia total : " + String.format("%.3f", new Rota(cidades).calculaDistanciaTotal()) + " Km");
        System.out.println(separador);

        Cidade cidade = cidades.get((int) (cidades.size() * Math.random()));
        this.atualizaRotas(cidadesMenorRota, cidades, cidade);

        while (cidades.size() >= 1) {
            cidade = this.proximaCidade(cidades, cidade);
            this.atualizaRotas(cidadesMenorRota, cidades, cidade);
        }
        return new Rota(cidadesMenorRota);
    }

    private void atualizaRotas(final ArrayList<Cidade> cidadesMenorRota, final ArrayList<Cidade> cidades, final Cidade cidade) {

        cidadesMenorRota.add(cidade);
        cidades.remove(cidade);
        System.out.println("Cidades na menor rota ==> " + Arrays.toString(cidadesMenorRota.toArray()));
        System.out.println("Cidades restantes     ==> " + Arrays.toString(cidades.toArray()) + "\n");
    }

    private Cidade proximaCidade(final ArrayList<Cidade> cidades, final Cidade cidade) {

        return cidades.stream().min((cidade1, cidade2) -> {
            int flag = 0;
            if (cidade1.medeDistancia(cidade) < cidade2.medeDistancia(cidade)) {
                flag = -1;
            } else if (cidade1.medeDistancia(cidade) > cidade2.medeDistancia(cidade)) {
                flag = 1;
            }
            return flag;
        }).get();
    }
}
