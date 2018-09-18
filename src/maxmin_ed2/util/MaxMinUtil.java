package maxmin_ed2.util;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class MaxMinUtil {

    /**
     * Método que cria uma matriz com números aleatórios
     *
     * @param tam
     *
     * @return int[] array
     */
    public static Integer[] arrayRandomico(final int tam) {

        final Integer[] array = new Integer[tam];

        final Random rand = new Random();
        final int max = 999999;
        final int min = 0;
        rand.nextInt(((max - min) + 1) + min);
        for (int i = 0; i < tam; i++) {
            array[i] = rand.nextInt(((max - min) + 1) + min);
        }
        return array;
    }

    /**
     * Método que imprime array utilizando Stream
     *
     * @param vetor
     */
    public static void imprimeVetor(final int[] vetor) {

        final String vet = Arrays.stream(vetor)
                        .mapToObj(i -> i)
                        .map(i -> i.toString())
                        .collect(Collectors.joining(","));
        System.out.println("Vetor: [" + vet + "]");
    }
}
