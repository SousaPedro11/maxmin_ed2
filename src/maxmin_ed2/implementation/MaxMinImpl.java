package maxmin_ed2.implementation;

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
     */
    public static int[] maxMin1(final Integer[] vetor, final int n) {

        // inicializa max e min como o valor do primeiro elemento do vetor
        int maximo = vetor[0];
        int minimo = vetor[0];

        // varre o vetor fazendo as comparações
        for (int i = 1; i < n; i++) {
            if (vetor[i] > maximo) {// se o elemento na posicao i do vetor for maior que a variavel maximo, esta assume o valor do elemento
                maximo = vetor[i];
            }
            if (vetor[i] < minimo) {// se o elemento na posicao i do vetor for menor que a variavel minimo, esta assume o valor do elemento
                minimo = vetor[i];
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
     * @return
     */
    public static int[] maxMin2(final Integer[] vetor, final int n) {

        // inicializa max e min como o valor do primeiro elemento do vetor
        int maximo = vetor[0];
        int minimo = vetor[0];

        // varre o vetor fazendo as comparações
        for (int i = 1; i < n; i++) {
            if (vetor[i] > maximo) {// se o elemento na posicao i do vetor for maior que a variavel maximo, esta assume o valor do elemento
                maximo = vetor[i];
            } else if (vetor[i] < minimo) {// senao, se o elemento na posicao i do vetor for menor que a variavel minimo, esta assume o valor do
                                           // elemento
                minimo = vetor[i];
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
     * @return
     */
    public static int[] maxMin3(final Integer[] vetor, final int n) {

        // inicializa maximo e minimo como o valor do primeiro elemento do vetor
        int maximo;
        int minimo;
        int fimDoAnel;
        int i = 2;

        if ((n % 2) > 0) {// se n for par
            vetor[n] = vetor[n - 1];
            fimDoAnel = n;
        } else {// se nao for par
            fimDoAnel = n - 1;
        }

        if (vetor[0] > vetor[1]) {// se o primeiro elemento for maior que o segundo
            maximo = vetor[0];
            minimo = vetor[1];
        } else {// se o primeiro elemento não for maior que o segundo
            maximo = vetor[1];
            minimo = vetor[0];
        }

        // varre o vetor fazendo as comparações
        while (i < fimDoAnel) {
            if (vetor[i] > vetor[i + 1]) {// se o elemento do vetor for maior que o proximo elemento
                if (vetor[i] > maximo) {// se este elemento for o maior
                    maximo = vetor[i];
                }

                if (vetor[i + 1] < minimo) {
                    minimo = vetor[i + 1];
                }
            } else {
                if (vetor[i] < minimo) {
                    minimo = vetor[i];
                }

                if (vetor[i + 1] > maximo) {
                    maximo = vetor[i + 1];
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
