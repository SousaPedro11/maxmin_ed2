package tsp.vizinhomaisproximo;

import java.util.ArrayList;
import java.util.Arrays;

import tsp.vizinhomaisproximo.util.Utilitario;

public class VizinhoMaisProximo {

    public static Cidade cidadeinicial = null;

    public static Cidade cidadefinal = null;

    public static final ArrayList<Cidade> menorRota = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public Rota encontraMenorRota(final ArrayList<Cidade> cidadesIniciais, final Cidade input) {

        final ArrayList<Cidade> cidades = (ArrayList<Cidade>) cidadesIniciais.clone();

        final ArrayList<Cidade> cidadesMenorRota = new ArrayList<>();
        final String separador = Utilitario.printaSeparador();
        Cidade cidade = null;

        if (input == null) {
            VizinhoMaisProximo.cidadeinicial = cidades.get((int) (cidades.size() * Math.random()));
        } else {
            VizinhoMaisProximo.cidadeinicial = input;
        }
        System.out.println(separador);
        System.out.println("Lista de cidades:     ==> " + Arrays.toString(cidades.toArray()));
        System.out.println("Distancia total nesse percurso : " + String.format("%.3f", new Rota(cidades).calculaDistanciaInicial()) + " Km");
        System.out.println(separador);

        cidade = VizinhoMaisProximo.cidadeinicial;
        this.atualizaRotas(cidadesMenorRota, cidades, cidade);

        while (cidades.size() >= 1) {
            cidade = this.proximaCidade(cidades, cidade);
            this.atualizaRotas(cidadesMenorRota, cidades, cidade);
        }

        // this.atualizaRotas(cidadesMenorRota, cidades, VizinhoMaisProximo.cidadeinicial);
        // cidadesMenorRota.add(VizinhoMaisProximo.cidadeinicial);
        VizinhoMaisProximo.menorRota.clear();
        VizinhoMaisProximo.menorRota.addAll(cidadesMenorRota);
        VizinhoMaisProximo.menorRota.add(VizinhoMaisProximo.cidadeinicial);
        System.out.println("Cidades na menor rota ==> " + Arrays.toString(VizinhoMaisProximo.menorRota.toArray()));

        VizinhoMaisProximo.cidadefinal = cidade;
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
