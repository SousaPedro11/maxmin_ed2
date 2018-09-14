package maxmin_ed2;

import org.testng.annotations.Test;

public class Main {

    static final int REPETICAO = 5;

    // Define o tamanho do vetor
    final int tam = 90000000;

    final int[] vetor = MaxMinUtil.arrayRandomico(this.tam);

    @Test(invocationCount = Main.REPETICAO)
    public void min1() {

        ImplementaMaxMin.maxMin1(this.vetor);
    }

    @Test(invocationCount = Main.REPETICAO, dependsOnMethods = "min1")
    public void min2() {

        ImplementaMaxMin.maxMin2(this.vetor);
    }

    @Test(invocationCount = Main.REPETICAO, dependsOnMethods = "min2")
    public void min3() {

        ImplementaMaxMin.maxMin3(this.vetor);
    }
}