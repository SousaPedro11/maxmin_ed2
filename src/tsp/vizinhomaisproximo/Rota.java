package tsp.vizinhomaisproximo;

import java.util.ArrayList;
import java.util.Arrays;

public class Rota {

    private final ArrayList<Cidade> cidades = new ArrayList<>();

    public Rota(final ArrayList<Cidade> cidades) {

        this.cidades.addAll(cidades);
    }

    public ArrayList<Cidade> getCidades() {

        return this.cidades;
    }

    public double calculaDistanciaTotal() {

        final int tamCidade = this.getCidades().size();

        return /* (int) */(this.getCidades().stream().mapToDouble(x -> {
            final int indiceCidade = this.getCidades().indexOf(x);
            double retorno = 0;
            if (indiceCidade < (tamCidade - 1)) {
                retorno = x.medeDistancia(this.getCidades().get(indiceCidade + 1));
            }
            return retorno;
        }).sum() + this.getCidades().get(tamCidade - 1).medeDistancia(this.getCidades().get(0)));
    }

    @Override
    public String toString() {

        return Arrays.toString(this.cidades.toArray());
    }
}
