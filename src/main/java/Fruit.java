public abstract class Fruit extends Box {
    private static int quantity;
    private static double weight;


    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void setQuantity(int quantity);
}
