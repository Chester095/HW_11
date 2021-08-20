public class Orange extends Fruit {
    private int quantity;
    private double weight;

    public Orange(int quantity, double weight) {
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
        return "Апельсины {" +
                "Кол-во=" + quantity +
                ", вес=" + weight +
                "}";
    }
}
