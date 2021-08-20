public class Apple extends Fruit{
    private int quantity;
    private double weight;

    public Apple(int quantity, double weight) {
        this.quantity = quantity;
        this.weight = weight;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Яблоки {" +
                "Кол-во=" + quantity +
                ", вес=" + weight +
                "} ";
    }
}
