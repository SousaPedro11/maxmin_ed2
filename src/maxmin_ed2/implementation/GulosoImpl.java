package maxmin_ed2.implementation;

import java.text.DecimalFormat;

public final class GulosoImpl {

    private static String nomeMoeda;

    private static StringBuilder result = null;

    private GulosoImpl() {

    }

    /**
     * Calcula o troco a ser entregue de acordo com o valor da conta e o valor pago
     *
     * @param valorConta
     * @param valorPago
     * @return String resultado
     */
    public static String calculaTroco(final double valorConta, final double valorPago) {

        String resultado;

        GulosoImpl.result = new StringBuilder();
        final DecimalFormat formatador = new DecimalFormat("###,##0.00");

        GulosoImpl.result.append("TRANSAÇÃO").append("\n");
        GulosoImpl.result.append("Valor da conta: ").append(formatador.format(valorConta)).append("\n");
        GulosoImpl.result.append("Valor pago: ").append(formatador.format(valorPago)).append("\n\n");

        GulosoImpl.result.append("RESULTADO").append("\n");

        if (valorPago < valorConta) {
            GulosoImpl.result.append("Pagamento insuficiente! Faltam R$").append(formatador.format(valorConta - valorPago)).append("\n");

            resultado = GulosoImpl.result.toString();

        } else if (valorPago == valorConta) {
            GulosoImpl.result.append("Não há troco!").append("\n");

            resultado = GulosoImpl.result.toString();

        } else {
            final int cedula[] = { 100, 50, 20, 10, 5, 2, 1 };// de 1 presente apenas para fins de cálculo

            final int moeda[] = { 50, 25, 10, 5, 1 };

            final double troco = valorPago - valorConta;

            int valor;

            GulosoImpl.result.append("Troco = R$").append(formatador.format(troco)).append("\n\n");

            // calcula a quantidade de cédulas
            valor = (int) troco;

            GulosoImpl.nomeMoeda = "cédula";

            GulosoImpl.calculaQuantidade(valor, cedula);

            // calcula parte fracionaria
            valor = (int) Math.round((troco - (int) troco) * 100);

            // calcula a quantidade de moedas
            GulosoImpl.nomeMoeda = "moeda";

            GulosoImpl.calculaQuantidade(valor, moeda);

            resultado = GulosoImpl.result.toString();
        }
        return resultado;
    }

    /**
     * Calcula a quantidade de cédulas e/ou moedas do troco
     *
     * @param valor
     * @param tipoMoeda
     */
    private static void calculaQuantidade(int valor, final int[] tipoMoeda) {

        int quantidade = 0;
        int i = 0;

        while (valor != 0) {
            quantidade = valor / tipoMoeda[i]; // calcula a quantidade de cedulas/moedas
            if (quantidade != 0) {
                if (valor != 1) {
                    GulosoImpl.result.append(quantidade).append(" ").append(GulosoImpl.nomeMoeda);
                } else {
                    GulosoImpl.result.append(quantidade).append(" ").append("moeda");
                }
                if (quantidade > 1) {
                    GulosoImpl.result.append("s");
                }

                if (!GulosoImpl.nomeMoeda.equalsIgnoreCase("moeda")) {

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

                valor = valor % tipoMoeda[i]; // resto
            }
            i = i + 1; // próxima cedula/moeda
        }
    }
}
