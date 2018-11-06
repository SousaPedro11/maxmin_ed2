package test;

import org.testng.annotations.Test;

import maxmin_ed2.MaxMinImpl;
import maxmin_ed2.util.MaxMinUtil;

public class TesteMaxMin {

    static final int REPETICAO = 1;

    // Define o tamanho do vetor
    final Integer tam = 20/* 10000000 */;

    final Integer[] vetor = MaxMinUtil.arrayRandomico(this.tam);

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min1() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin1(this.vetor, this.tam);

        this.imprimeResultados("MaxMin1", maxmin);
        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin1: %.3f ms%n", (float) (tempoFinal - tempoInicial));

    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min2() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin2(this.vetor, this.tam);

        this.imprimeResultados("MaxMin2", maxmin);
        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin1: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min3() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin3(this.vetor, this.tam);

        this.imprimeResultados("MaxMin3", maxmin);
        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin1: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    private void imprimeResultados(final String nome, final int[] maxmin) {

        System.out.println(nome);
        System.out.println("Maximo: " + maxmin[0]);
        System.out.println("Mínimo: " + maxmin[1]);
    }
}