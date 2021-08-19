import java.util.ArrayList;
import java.util.Collections;

public class FirstAndSecond {
    static String[] people = {"Коля", "Серёжа", "Катя", "Петя", "Федя", "Дуся", "Ваня"};
    static Integer[] money = {150, 350, 450, 650, 550, 750, 950};
    static Double[] height = {185.5, 186.1, 190.0, 170.0, 165.5, 200.3, 193.1};
    static ArrayList <String> cats = new ArrayList<>();



    public static void main(String[] args) {
        Printer.print(people);
        SwitchPlaces.switchPlaces(people,0,1); Printer.print(people);

        Printer.print(height);
        SwitchPlaces.switchPlaces(height,0,1); Printer.print(height);

        Printer.print(money);
        SwitchPlaces.switchPlaces(money,0,1); Printer.print(money);

        cats.add("Гоша"); cats.add("Барсик"); cats.add("Мурзик"); cats.add("Бобик"); cats.add("Шарик"); Printer.print(cats);
        SwitchPlaces.switchPlaces(cats,0,1); Printer.print(cats);

        ArrayList<String> peopleArray = arrayToArrayList(people); Printer.print(peopleArray);

    }


    public static <T> ArrayList<T> arrayToArrayList(T[] array){
        ArrayList<T> temp = new ArrayList<>();
        Collections.addAll(temp, array);
        return temp;
    }


    static class SwitchPlaces {
        public static <T> void switchPlaces(T[] array, int number1, int number2) {
            T temp = array[number1]; array[number1] = array[number2]; array[number2] = temp;
        }
        public static <T> void switchPlaces(ArrayList<T> array, int number1, int number2) {
            T temp = array.get(number1); array.set(number1, array.get(number2));array.set(number2, temp);
        }
    }


    static class Printer{
        public static <T> void print(T[] array){
            for (T item: array) {System.out.print(item+"\t");} System.out.println();
        }
        public static <T> void print(ArrayList<T> array) {
            array.stream().map(t -> t + "\t").forEach(System.out::print); System.out.println();
        }
    }

}
