public class Circulo {

    private double raio;

    public Circulo(double raio) {
        definirRaio(raio);
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public void definirRaio(double novoRaio) {
        if (novoRaio > 0) {
            this.raio = novoRaio;
        } else {
            throw new IllegalArgumentException("O raio deve ser um valor positivo.");
        }
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public boolean saoIguais(Circulo outroCirculo) {
        return this.raio == outroCirculo.raio;
    }

    public double calcularAreaSombreada(Circulo outroCirculo) {
        if (this.raio >= outroCirculo.raio) {
            double areaCirculoMaior = this.calcularArea();
            double areaCirculoMenor = outroCirculo.calcularArea();
            return areaCirculoMaior - areaCirculoMenor;
        } else {
            throw new IllegalArgumentException("O raio do primeiro círculo deve ser maior ou igual ao raio do segundo círculo.");
        }
    }

    public static Circulo criarAPartirDeCoordenadas(double x, double y, double raio) {
        double distanciaAoCentro = Math.sqrt(x * x + y * y);
        return new Circulo(distanciaAoCentro + raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;

        return Double.compare(raio, circulo.raio) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(raio);
        return (int) (temp ^ (temp >>> 32));
    }

}
