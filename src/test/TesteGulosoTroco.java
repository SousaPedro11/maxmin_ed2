package test;

import org.testng.annotations.Test;

import guloso.troco.GulosoTrocoImpl;

public class TesteGulosoTroco {

    double valorConta;

    double valorPago;

    @Test
    private void pagamentoInteiroMaior() {

        this.valorConta = 100;
        this.valorPago = 108;

        System.out.println("1 - Teste pagamentoInteiroMaior");
        System.out.println(GulosoTrocoImpl.calculaTroco(this.valorConta, this.valorPago));
    }

    @Test(dependsOnMethods = "pagamentoInteiroMaior")
    private void pagamentoFracionadoMaior() {

        this.valorConta = 100.62;
        this.valorPago = 103.65;

        System.out.println("\n2 - Teste pagamentoFracionadoMaior");
        System.out.println(GulosoTrocoImpl.calculaTroco(this.valorConta, this.valorPago));
    }

    @Test(dependsOnMethods = "pagamentoInteiroMaior")
    private void pagamentoFracionadoMaior1() {

        this.valorConta = 100.62;
        this.valorPago = 199.40;

        System.out.println("\n2 - Teste pagamentoFracionadoMaior1");
        System.out.println(GulosoTrocoImpl.calculaTroco(this.valorConta, this.valorPago));
    }

    @Test(dependsOnMethods = "pagamentoFracionadoMaior")
    private void pagamentoIgual() {

        this.valorConta = 100.35;
        this.valorPago = 100.35;

        System.out.println("\n3 - Teste pagamentoIgual");
        System.out.println(GulosoTrocoImpl.calculaTroco(this.valorConta, this.valorPago));
    }

    @Test(dependsOnMethods = "pagamentoIgual")
    private void pagamentoMenor() {

        this.valorConta = 100.35;
        this.valorPago = 92;

        System.out.println("\n4 - Teste pagamentoMenor");
        System.out.println(GulosoTrocoImpl.calculaTroco(this.valorConta, this.valorPago));
    }
}
