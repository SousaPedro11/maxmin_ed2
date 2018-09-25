package tsp.vizinhomaisproximo.util;

public final class Utilitario {

    private Utilitario() {

    }

    public static String printaSeparador() {

        final StringBuilder sep = new StringBuilder();
        for (int i = 0; i < 73; i++) {
            sep.append("-");
        }
        return sep.toString();
    }
}
