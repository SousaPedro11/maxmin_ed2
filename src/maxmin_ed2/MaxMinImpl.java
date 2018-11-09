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
     * @param lista
     * @return [max,min]
     */
    public static int[] maxMin1(final List<Integer> lista, final int n) {

        final List<Integer> listaAux = new ArrayList<>(lista);

        // inicializa max e min como o valor do primeiro elemento da lista
        int maximo = listaAux.get(0);
        int minimo = listaAux.get(0);

        // varre a lista fazendo as comparações
        for (int i = 1; i < n; i++) {
            if (listaAux.get(i) > maximo) {// se o elemento na posicao i da lista for maior que a variavel maximo, esta assume o valor do elemento
                maximo = listaAux.get(i);
            }
            if (listaAux.get(i) < minimo) {// se o elemento na posicao i da lista for menor que a variavel minimo, esta assume o valor do elemento
                minimo = listaAux.get(i);
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
     * @param lista
     * @return [max,min]
     */
    public static int[] maxMin2(final List<Integer> lista, final int n) {

        final List<Integer> listaAux = new ArrayList<>(lista);

        // inicializa max e min como o valor do primeiro elemento da lista
        int maximo = listaAux.get(0);
        int minimo = listaAux.get(0);

        // varre a lista fazendo as comparações
        for (int i = 1; i < n; i++) {
            if (listaAux.get(i) > maximo) {// se o elemento na posicao i da lista for maior que a variavel maximo, esta assume o valor do elemento
                maximo = listaAux.get(i);
            } else if (listaAux.get(i) < minimo) {// senao, se o elemento na posicao i da lista for menor que a variavel minimo, esta assume o valor
                                                  // do elemento
                minimo = listaAux.get(i);
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
     * @param lista
     * @return [max,min]
     */
    public static int[] maxMin3(final List<Integer> lista, final int n) {

        final List<Integer> listaAux = new ArrayList<>(lista);

        // inicializa maximo e minimo como o valor do primeiro elemento da lista
        int maximo;
        int minimo;
        int fimDoAnel;

        if ((n % 2) > 0) {// se n for par
            listaAux.add(listaAux.get(n - 1));
            fimDoAnel = n;
        } else {// se nao for par
            fimDoAnel = n - 1;
        }

        if (listaAux.get(0) > listaAux.get(1)) {// se o primeiro elemento for maior que o segundo
            maximo = listaAux.get(0);
            minimo = listaAux.get(1);
        } else {// se o primeiro elemento não for maior que o segundo
            maximo = listaAux.get(1);
            minimo = listaAux.get(0);
        }

        int i = 2;
        // varre a lista fazendo as comparações
        while (i < fimDoAnel) {
            if (listaAux.get(i) > listaAux.get(i + 1)) {// se o elemento da lista for maior que o proximo elemento
                if (listaAux.get(i) > maximo) {// se este elemento for o maior
                    maximo = listaAux.get(i);
                }

                if (listaAux.get(i + 1) < minimo) {
                    minimo = listaAux.get(i + 1);
                }
            } else {
                if (listaAux.get(i) < minimo) {
                    minimo = listaAux.get(i);
                }

                if (listaAux.get(i + 1) > maximo) {
                    maximo = listaAux.get(i + 1);
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
