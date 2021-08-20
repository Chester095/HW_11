import java.util.ArrayList;

public class Box {

    Fruit fruit;

    public static void main(String[] args) {
        Fruit orange1 = new Orange(15, 10.1);
        Fruit orange2 = new Orange(14, 9.1);
        Fruit orange3 = new Orange(12, 8.1);
        Fruit apple1 = new Apple(15, 8.1);
        Fruit apple2 = new Apple(7, 18.1);
        Fruit apple3 = new Apple(1, 83.1);
        Fruit apple4 = new Apple(19, 8.1);
        ArrayList<Box> box1 = new ArrayList<>();
        ArrayList<Box> box2 = new ArrayList<>();
        ArrayList<Box> box3 = new ArrayList<>();
        box1.add(orange1);
        box1.add(orange2);
        box1.add(orange3);
//        System.out.println(box1);
        addFruits.addFruits(box2, orange1);
        System.out.println(box2);
        addFruits.addFruits(box2, orange2);
        System.out.println(box2 + "\n");
        addFruits.addFruits(box2, apple1);
        System.out.println(box2 + "\n");
        addFruits.addFruits(box3, apple1);
        addFruits.addFruits(box3, apple2);
        addFruits.addFruits(box3, apple3);
        addFruits.addFruits(box3, apple4);
        addFruits.addFruits(box3, orange2);
        System.out.println("Сумма " + apple1.getClass().getName() + "  " + getWeightOne(apple1));
        System.out.println("Сумма " + orange2.getClass().getName() + "  " + getWeightOne(orange2));
        System.out.println(getWeight(box3));
        System.out.println("Сравнение двух коробок " + compare(box1,box2));
    }


    /*** Добавляем фрукты в коробки и проверяем на совместимость
     *
     */
    static class addFruits {
        public static <A, F> void addFruits(ArrayList<A> arrayList, F fruit) {
            if (arrayList.isEmpty() || arrayList.get(0).getClass() == fruit.getClass()) {
                arrayList.add((A) fruit);
            } else
                System.out.println("Очнись, там хранятся " + arrayList.get(0).getClass().getName() + ". А ты пытаешься туда засунуть " + fruit.getClass().getName() + ".");
        }
    }

    /*** Высчитываем вес одной коробки
     *
     * @param arrayList
     * @param <A>
     * @return
     */
    public static <A> double getWeight(ArrayList<A> arrayList) {
        double summ = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            summ += getWeightOne((Fruit) arrayList.get(i));
            System.out.println(arrayList.get(i));
        }
        return summ;
    }

    /*** Высчитываем вес одного комплекта фруктов
     *
     * @param fruit
     * @return
     */
    public static double getWeightOne(Fruit fruit) {
        return fruit.getWeight() * fruit.getQuantity();
    }

    /*** Сравнение массы двух коробок
     *
     * @param arrayList1
     * @param arrayList2
     * @param <A>
     * @param <B>
     * @return
     */
    public static <A, B> boolean compare(ArrayList<A> arrayList1, ArrayList<B> arrayList2) {
        boolean compare = false;
        if (getWeight(arrayList1) == getWeight(arrayList2)) compare = true;
        return compare;
    }
}
