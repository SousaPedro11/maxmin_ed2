package test;

import java.util.Arrays;
import java.util.Comparator;

import org.testng.annotations.Test;

import maxmin_ed2.MaxMinImpl;
import maxmin_ed2.util.MaxMinUtil;

public class TesteMaxMin {

    static final int REPETICAO = 1;

    // Define o tamanho do vetor
    static Integer tam = 15;

    final static Integer[] vetor = MaxMinUtil.arrayRandomico(TesteMaxMin.tam);

    final static Integer[] pior = Arrays.stream(TesteMaxMin.vetor).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);

    final static Integer[] melhor = Arrays.stream(TesteMaxMin.vetor).sorted().toArray(Integer[]::new);

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min1Melhor() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin1(TesteMaxMin.melhor, TesteMaxMin.tam);

        this.imprimeResultados("MaxMin1Melhor", maxmin);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin1Melhor: %.3f ms%n", (float) (tempoFinal - tempoInicial));

    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min2Melhor() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin2(TesteMaxMin.melhor, TesteMaxMin.tam);

        this.imprimeResultados("MaxMin2Melhor", maxmin);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin2Melhor: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min3Melhor() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin3(TesteMaxMin.melhor, TesteMaxMin.tam);

        this.imprimeResultados("MaxMin3Melhor", maxmin);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin3Melhor: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min1() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin1(TesteMaxMin.vetor, TesteMaxMin.tam);

        this.imprimeResultados("MaxMin1", maxmin);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin1: %.3f ms%n", (float) (tempoFinal - tempoInicial));

    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min2() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin2(TesteMaxMin.vetor, TesteMaxMin.tam);

        this.imprimeResultados("MaxMin2", maxmin);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin2: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min3() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin3(TesteMaxMin.vetor, TesteMaxMin.tam);

        this.imprimeResultados("MaxMin3", maxmin);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin3: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min1Pior() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin1(TesteMaxMin.pior, TesteMaxMin.tam);

        this.imprimeResultados("MaxMin1Pior", maxmin);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin1Pior: %.3f ms%n", (float) (tempoFinal - tempoInicial));

    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min2Pior() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin1(TesteMaxMin.pior, TesteMaxMin.tam);

        this.imprimeResultados("MaxMin2Pior", maxmin);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin2Pior: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min3Pior() {

        // inicia o contador de tempo
        final long tempoInicial = System.currentTimeMillis();
        final int[] maxmin = MaxMinImpl.maxMin1(TesteMaxMin.pior, TesteMaxMin.tam);

        this.imprimeResultados("MaxMin3Pior", maxmin);

        // finaliza a contagem do tempo e imprime o tempo de execucao do metodo
        final long tempoFinal = System.currentTimeMillis();
        System.out.printf("Tempo de execução maxMin3Pior: %.3f ms%n", (float) (tempoFinal - tempoInicial));
    }

    private void imprimeResultados(final String nome, final int[] maxmin) {

        System.out.println(nome);
        System.out.println("Maximo: " + maxmin[0]);
        System.out.println("Mínimo: " + maxmin[1]);
    }
}