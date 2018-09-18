package test;

import org.testng.annotations.Test;

import maxmin_ed2.implementation.MaxMinImpl;
import maxmin_ed2.util.MaxMinUtil;

public class TesteMaxMin {

    static final int REPETICAO = 5;

    // Define o tamanho do vetor
    final Integer tam = 50000000;

    final Integer[] vetor = MaxMinUtil.arrayRandomico(this.tam);

    @Test(invocationCount = TesteMaxMin.REPETICAO)
    public void min1() {

        MaxMinImpl.maxMin1(this.vetor);
    }

    @Test(invocationCount = TesteMaxMin.REPETICAO, dependsOnMethods = "min1")
    public void min2() {

        MaxMinImpl.maxMin2(this.vetor);
    }

    @Test(invocationCount = TesteMaxMin.REPETICAO, dependsOnMethods = "min2")
    public void min3() {

        MaxMinImpl.maxMin3(this.vetor);
    }
}