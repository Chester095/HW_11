public class Apple extends Fruit{
    int quantityApple;
    double weightApple;

    public Apple(int quantityOrange, double weightOrange) {
        this.quantityApple = quantityApple;
        this.weightApple = weightApple;
    }

    public int getQuantityApple() {
        return quantityApple;
    }

    public double getWeightApple() {
        return weightApple;
    }

    @Override
    public String toString() {
        return "Яблоки {" +
                "Кол-во=" + quantityApple +
                ", вес=" + weightApple +
                "} " + super.toString();
    }
}
