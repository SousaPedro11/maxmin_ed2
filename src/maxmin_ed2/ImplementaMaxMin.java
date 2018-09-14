package maxmin_ed2;

public final class ImplementaMaxMin {

    private ImplementaMaxMin() {

    }

    /**
     * <p>
     * Implementa��o do algoritmo MaxMin1
     * </p>
     * COMPLEXIDADE
     * <li>Melhor caso: 2(n-1)
     * <li>Pior caso: 2(n-1)
     * <li>Caso m�dio: 2(n-1)
     * </li>
     *
     * @param vetor
     */
    public static void maxMin1(final int[] vetor) {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();

        // inicializa max e min como o valor do primeiro elemento do vetor
        int maximo = vetor[0];
        int minimo = vetor[0];

        // varre o vetor fazendo as compara��es
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maximo) {// se o elemento na posicao i do vetor for maior que a variavel maximo, esta assume o valor do elemento
                maximo = vetor[i];
            }
            if (vetor[i] < minimo) {// se o elemento na posicao i do vetor for menor que a variavel minimo, esta assume o valor do elemento
                minimo = vetor[i];
            }
        }

        // saida
        System.out.println("\nMaxMin1");
        System.out.println("O valor m�nimo �: " + minimo);
        System.out.println("O valor m�ximo �: " + maximo);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execu��o maxMin1: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    /**
     * <p>
     * Implementa��o do algoritmo MaxMin2
     * </p>
     * COMPLEXIDADE
     * <li>Melhor caso: n-1
     * <li>Pior caso: 2(n-1)
     * <li>Caso m�dio: 3n/2 - 3/2
     * </li>
     *
     * @param vetor
     */
    public static void maxMin2(final int[] vetor) {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();

        // inicializa max e min como o valor do primeiro elemento do vetor
        int maximo = vetor[0];
        int minimo = vetor[0];

        // varre o vetor fazendo as compara��es
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maximo) {// se o elemento na posicao i do vetor for maior que a variavel maximo, esta assume o valor do elemento
                maximo = vetor[i];
            } else if (vetor[i] < minimo) {// senao, se o elemento na posicao i do vetor for menor que a variavel minimo, esta assume o valor do
                                           // elemento
                minimo = vetor[i];
            }
        }

        // saida
        System.out.println("\nMaxMin2");
        System.out.println("O valor m�nimo �: " + minimo);
        System.out.println("O valor m�ximo �: " + maximo);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execu��o maxMin2: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    /**
     * <p>
     * Implementa��o do algoritmo MaxMin3
     * </p>
     * COMPLEXIDADE
     * <li>Melhor caso: 3n/2 - 2
     * <li>Pior caso: 3n/2 - 2
     * <li>Caso m�dio: 3n/2 - 2
     * </li>
     *
     * @param vetor
     */
    public static void maxMin3(final int[] vetor) {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();

        // inicializa maximo e minimo como o valor do primeiro elemento do vetor
        int maximo = vetor[0];
        int minimo = vetor[0];
        // define n como o tamanho do vetor
        final int tamanho = vetor.length;
        int fimDoAnel;

        if ((tamanho % 2) > 0) {// se tamanho for par
            vetor[tamanho] = vetor[tamanho - 1];
            fimDoAnel = tamanho;
        } else {// se nao for par
            fimDoAnel = tamanho - 1;
        }

        if (vetor[0] > vetor[1]) {// se o primeiro elemento for maior que o segundo
            maximo = vetor[0];
            minimo = vetor[1];
        } else {// se o primeiro elemento n�o for maior que o segundo
            maximo = vetor[1];
            minimo = vetor[0];
        }

        // varre o vetor fazendo as compara��es
        for (int i = 2; i < fimDoAnel; i++) {
            if (vetor[i] > vetor[i + 1]) {// se o elemento do vetor for maior que o proximo elemento
                if (vetor[i] > maximo) {// se este elemento for o maior
                    maximo = vetor[i];
                }

                if (vetor[i + 1] < minimo) {
                    minimo = vetor[i + 1];
                }
            } else {
                if (vetor[i + 1] > maximo) {
                    maximo = vetor[i + 1];
                }

                if (vetor[i] < minimo) {
                    minimo = vetor[i];
                }
            }
        }

        // saida
        System.out.println("\nMaxMin3");
        System.out.println("O valor m�nimo �: " + minimo);
        System.out.println("O valor m�ximo �: " + maximo);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execu��o maxMin3: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

}
