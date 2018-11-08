package guloso.tsp;

import java.util.ArrayList;
import java.util.Arrays;

import guloso.tsp.util.Utilitario;

public class VizinhoMaisProximo {

    public static Cidade cidadeinicial = null;

    public static Cidade cidadefinal = null;

    public static final ArrayList<Cidade> menorRota = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public Rota encontraMenorRota(final ArrayList<Cidade> cidadesIniciais, final Cidade input) {

        final ArrayList<Cidade> cidades = (ArrayList<Cidade>) cidadesIniciais.clone();

        final ArrayList<Cidade> cidadesMenorRota = new ArrayList<>();

        Cidade cidade = null;

        if (input == null) {
            VizinhoMaisProximo.cidadeinicial = cidades.get((int) (cidades.size() * Math.random()));
        } else {
            VizinhoMaisProximo.cidadeinicial = input;
        }
        VizinhoMaisProximo.imprimeListaInicial(cidades, VizinhoMaisProximo.cidadeinicial.toString());

        cidade = VizinhoMaisProximo.cidadeinicial;
        this.atualizaRotas(cidadesMenorRota, cidades, cidade);

        while (cidades.size() >= 1) {
            cidade = this.proximaCidade(cidades, cidade);
            this.atualizaRotas(cidadesMenorRota, cidades, cidade);
        }

        VizinhoMaisProximo.menorRota.clear();
        VizinhoMaisProximo.menorRota.addAll(cidadesMenorRota);
        VizinhoMaisProximo.menorRota.add(VizinhoMaisProximo.cidadeinicial);
        System.out.println("Cidades visitadas (retorno) ==> " + Arrays.toString(VizinhoMaisProximo.menorRota.toArray()));

        VizinhoMaisProximo.cidadefinal = cidade;
        return new Rota(cidadesMenorRota);
    }

    public static void imprimeListaInicial(final ArrayList<Cidade> cidades, final String input) {

        System.out.println("Rota iniciada em: ".toUpperCase() + input.toString().toUpperCase());
        System.out.println(Utilitario.printaSeparador());
        System.out.println("Lista inicial de cidades: ==> " + Arrays.toString(cidades.toArray()));
        System.out.println("Distancia total nessa ordem : " + String.format("%.3f", new Rota(cidades).calculaDistanciaInicial()) + " Km");
        System.out.println(Utilitario.printaSeparador());
    }

    private void atualizaRotas(final ArrayList<Cidade> cidadesMenorRota, final ArrayList<Cidade> cidades, final Cidade cidade) {

        cidadesMenorRota.add(cidade);
        cidades.remove(cidade);
        System.out.println("Cidades visitadas ==> " + Arrays.toString(cidadesMenorRota.toArray()));
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
