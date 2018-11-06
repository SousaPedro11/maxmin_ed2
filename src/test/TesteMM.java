package test;

import java.util.stream.Stream;

import org.testng.annotations.Test;

import maxmin_ed2.MaxMinImpl;
import maxmin_ed2.util.MaxMinUtil;

public class TesteMM {

    final Integer tam = 16;

    private final Integer[] vetor = MaxMinUtil.arrayRandomico(this.tam);

    @Test
    private void maxMin1() {

        Stream.of(this.vetor).forEach(System.out::println);
        final int[] maxmin = MaxMinImpl.maxMin1(this.vetor, this.tam);
        System.out.println("Maximo: " + maxmin[0]);
        System.out.println("Mínimo: " + maxmin[1]);
    }

    @Test
    private void maxMin2() {

        Stream.of(this.vetor).forEach(System.out::println);
        final int[] maxmin = MaxMinImpl.maxMin2(this.vetor, this.tam);
        System.out.println("Maximo: " + maxmin[0]);
        System.out.println("Mínimo: " + maxmin[1]);
    }

    @Test
    private void maxMin3() {

        Stream.of(this.vetor).forEach(System.out::println);
        final int[] maxmin = MaxMinImpl.maxMin3(this.vetor, this.tam);
        System.out.println("Maximo: " + maxmin[0]);
        System.out.println("Mínimo: " + maxmin[1]);
    }
}
