public class Orange extends Fruit {
    int quantityOrange;
    double weightOrange;

    public Orange(int quantityOrange, double weightOrange) {
        this.quantityOrange = quantityOrange;
        this.weightOrange = weightOrange;
    }

    public int getQuantityOrange() {
        return quantityOrange;
    }

    public double getWeightOrange() {
        return weightOrange;
    }

    @Override
    public String toString() {
        return "Апельсины {" +
                "Кол-во=" + quantityOrange +
                ", вес=" + weightOrange +
                "}";
    }
}
