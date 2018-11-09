package maxmin_ed2;

import java.util.ArrayList;
import java.util.List;

public final class MaxMinImpl {

    private MaxMinImpl() {

    }

    /**
     * <p>
     * Implementação do algoritmo MaxMin1
     * </p>
     * COMPLEXIDADE
     * <li>Melhor caso: 2(n-1)
     * <li>Pior caso: 2(n-1)
     * <li>Caso médio: 2(n-1)
     * </li>
     *
     * @param vetor
     * @return [max,min]
     */
    public static int[] maxMin1(final List<Integer> vetor, final int n) {

        final List<Integer> vetorAux = new ArrayList<>(vetor);

        // inicializa max e min como o valor do primeiro elemento do vetor
        int maximo = vetorAux.get(0);
        int minimo = vetorAux.get(0);

        // varre o vetor fazendo as comparações
        for (int i = 1; i < n; i++) {
            if (vetorAux.get(i) > maximo) {// se o elemento na posicao i do vetor for maior que a variavel maximo, esta assume o valor do elemento
                maximo = vetorAux.get(i);
            }
            if (vetorAux.get(i) < minimo) {// se o elemento na posicao i do vetor for menor que a variavel minimo, esta assume o valor do elemento
                minimo = vetorAux.get(i);
            }
        }

        // saida
        final int maxMin[] = new int[2];
        maxMin[0] = maximo;
        maxMin[1] = minimo;
        return maxMin;

    }

    /**
     * <p>
     * Implementação do algoritmo MaxMin2
     * </p>
     * COMPLEXIDADE
     * <li>Melhor caso: n-1
     * <li>Pior caso: 2(n-1)
     * <li>Caso médio: 3n/2 - 3/2
     * </li>
     *
     * @param vetor
     * @return [max,min]
     */
    public static int[] maxMin2(final List<Integer> vetor, final int n) {

        final List<Integer> vetorAux = new ArrayList<>(vetor);

        // inicializa max e min como o valor do primeiro elemento do vetor
        int maximo = vetorAux.get(0);
        int minimo = vetorAux.get(0);

        // varre o vetor fazendo as comparações
        for (int i = 1; i < n; i++) {
            if (vetorAux.get(i) > maximo) {// se o elemento na posicao i do vetor for maior que a variavel maximo, esta assume o valor do elemento
                maximo = vetorAux.get(i);
            } else if (vetorAux.get(i) < minimo) {// senao, se o elemento na posicao i do vetor for menor que a variavel minimo, esta assume o valor
                                                  // do
                // elemento
                minimo = vetorAux.get(i);
            }
        }

        // saida
        final int maxMin[] = new int[2];
        maxMin[0] = maximo;
        maxMin[1] = minimo;
        return maxMin;

    }

    /**
     * <p>
     * Implementação do algoritmo MaxMin3
     * </p>
     * COMPLEXIDADE
     * <li>Melhor caso: 3n/2 - 2
     * <li>Pior caso: 3n/2 - 2
     * <li>Caso médio: 3n/2 - 2
     * </li>
     *
     * @param vetor
     * @return [max,min]
     */
    public static int[] maxMin3(final List<Integer> vetor, final int n) {

        final List<Integer> vetorAux = new ArrayList<>(vetor);

        // inicializa maximo e minimo como o valor do primeiro elemento do vetor
        int maximo;
        int minimo;
        int fimDoAnel;

        if ((n % 2) > 0) {// se n for par
            vetorAux.add(vetorAux.get(n - 1));
            fimDoAnel = n;
        } else {// se nao for par
            fimDoAnel = n - 1;
        }

        if (vetorAux.get(0) > vetorAux.get(1)) {// se o primeiro elemento for maior que o segundo
            maximo = vetorAux.get(0);
            minimo = vetorAux.get(1);
        } else {// se o primeiro elemento não for maior que o segundo
            maximo = vetorAux.get(1);
            minimo = vetorAux.get(0);
        }

        int i = 2;
        // varre o vetor fazendo as comparações
        while (i < fimDoAnel) {
            if (vetorAux.get(i) > vetorAux.get(i + 1)) {// se o elemento do vetor for maior que o proximo elemento
                if (vetorAux.get(i) > maximo) {// se este elemento for o maior
                    maximo = vetorAux.get(i);
                }

                if (vetorAux.get(i + 1) < minimo) {
                    minimo = vetorAux.get(i + 1);
                }
            } else {
                if (vetorAux.get(i) < minimo) {
                    minimo = vetorAux.get(i);
                }

                if (vetorAux.get(i + 1) > maximo) {
                    maximo = vetorAux.get(i + 1);
                }
            }
            i += 2;
        }

        // saida
        final int maxMin[] = new int[2];
        maxMin[0] = maximo;
        maxMin[1] = minimo;
        return maxMin;

    }

}
