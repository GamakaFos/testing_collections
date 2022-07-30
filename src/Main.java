import java.util.*;
import funnyClasses.ArListCountRemovedElements;

public class Main {

    public int a = 10;

    public static void main(String[] args) {

        List<Integer> ar1 = new ArrayList<>();

        for(int i = 0; i < 5000; i++){
            ar1.add(Integer.valueOf((int) (15 + Math.random() * (36 - 15))));
        }



        ArListCountRemovedElements arListCountRemovedElements = new ArListCountRemovedElements();
        System.out.println("\nar1");
        System.out.println(ar1);
        System.out.println("Check if element exists");
        System.out.println("Element 15 - " + ar1.indexOf(15) + " with overall quantity " + arListCountRemovedElements.amount(ar1, 15));
        System.out.println("Element 20 - " + ar1.indexOf(20) + " with overall quantity " + arListCountRemovedElements.amount(ar1, 20));
        System.out.println("Element 25 - " + ar1.indexOf(25) + " with overall quantity " + arListCountRemovedElements.amount(ar1, 25));
        System.out.println("Element 30 - " + ar1.indexOf(30) + " with overall quantity " + arListCountRemovedElements.amount(ar1, 30));
        System.out.println("Element 35 - " + ar1.indexOf(35) + " with overall quantity " + arListCountRemovedElements.amount(ar1, 35));
    }


}