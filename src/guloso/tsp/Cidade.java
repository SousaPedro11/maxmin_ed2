package guloso.tsp;

public class Cidade {

    private static final double raioEquatorialTerra = 6378.1370D;

    private static final double grausRadianos = Math.PI / 180D;

    private final double longitude;

    private final double latitude;

    private final String nome;

    public Cidade(final String nome, final double latitude, final double longitude) {

        this.longitude = longitude * Cidade.grausRadianos;
        this.latitude = latitude * Cidade.grausRadianos;
        this.nome = nome;
    }

    public double getLongitude() {

        return this.longitude;
    }

    public double getLatitude() {

        return this.latitude;
    }

    public String getNome() {

        return this.nome;
    }

    public double medeDistancia(final Cidade cidade) {

        final double deltaLongitude = (cidade.getLongitude() - this.getLongitude());
        final double deltaLatitude = (cidade.getLatitude() - this.getLatitude());
        final double a = Math.pow(Math.sin(deltaLatitude / 2D), 2D) +
                        (Math.cos(this.getLatitude()) * Math.cos(cidade.getLatitude()) * Math.pow(Math.sin(deltaLongitude / 2D), 2D));
        return Cidade.raioEquatorialTerra * 2D * Math.atan2(Math.sqrt(a), Math.sqrt(1D - a));
    }

    @Override
    public String toString() {

        return this.nome;
    }
}
