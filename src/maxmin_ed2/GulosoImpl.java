package maxmin_ed2;

import java.text.DecimalFormat;

public final class GulosoImpl {

    // private static double troco;
    //
    // private static int i;
    //
    // private static int valor;
    //
    // private static int quantidade;

    private static String nomeMoeda;

    private static StringBuilder result = null;

    private GulosoImpl() {

    }

    /**
     * Calcula o troco a ser entregue de acordo com o valor da conta e o valor pago
     *
     * @param valorConta
     * @param valorPago
     * @return
     */
    public static String calculaTroco(final double valorConta, final double valorPago) {

        GulosoImpl.result = new StringBuilder();
        final DecimalFormat formatador = new DecimalFormat("###,##0.00");

        GulosoImpl.result.append("TRANSAÇÃO").append("\n");
        GulosoImpl.result.append("Valor da conta: ").append(formatador.format(valorConta)).append("\n");
        GulosoImpl.result.append("Valor pago: ").append(formatador.format(valorPago)).append("\n\n");

        GulosoImpl.result.append("RESULTADO").append("\n");

        if (valorPago < valorConta) {
            GulosoImpl.result.append("Pagamento insuficiente! Faltam R$").append(formatador.format(valorConta - valorPago)).append("\n");

            return (GulosoImpl.result.toString());

        } else if (valorPago == valorConta) {
            GulosoImpl.result.append("Não há troco!").append("\n");

            return GulosoImpl.result.toString();

        } else {
            final int cedula[] = { 100, 50, 20, 10, 5, 2, 1 };
            final int moeda[] = { 50, 25, 10, 5, 1 };
            double troco;
            int valor;
            troco = valorPago - valorConta;
            GulosoImpl.result.append("Troco = R$").append(formatador.format(troco)).append("\n\n");

            // calcula a quantidade de cédulas
            valor = (int) troco;

            GulosoImpl.nomeMoeda = "cedula";

            GulosoImpl.calculaQuantidade(valor, cedula);

            // calcula a quantidade de moedas
            valor = (int) Math.round((troco - (int) troco) * 100);

            GulosoImpl.nomeMoeda = "moeda";

            GulosoImpl.calculaQuantidade(valor, moeda);

            return (GulosoImpl.result.toString());
        }
    }

    private static void calculaQuantidade(int valor, final int[] tipoMoeda) {

        int quantidade = 0;
        int i = 0;
        // GulosoImpl.result.append("\n").append(GulosoImpl.nomeMoeda.toUpperCase()).append("\n");

        while (valor != 0) {
            quantidade = valor / tipoMoeda[i]; // calculando a qtde de notas
            if (quantidade != 0) {
                GulosoImpl.result.append(quantidade).append(" ").append(GulosoImpl.nomeMoeda);
                if (quantidade > 1) {
                    GulosoImpl.result.append("s");
                }

                if (GulosoImpl.nomeMoeda.equalsIgnoreCase("cedula")) {

                    GulosoImpl.result.append(" de R$");
                    GulosoImpl.result.append(tipoMoeda[i]).append("\n");
                } else {

                    GulosoImpl.result.append(" de ");
                    GulosoImpl.result.append(tipoMoeda[i]).append(" centavo");
                    if (tipoMoeda[i] > 1) {
                        GulosoImpl.result.append("s");
                    }
                    GulosoImpl.result.append("\n");
                }

                valor = valor % tipoMoeda[i]; // sobra
            }
            i = i + 1; // próxima nota
        }
    }
}
