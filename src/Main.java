import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arList1 = new ArrayList();
        for (int i = 0; i < 20; i++) {
            arList1.add(String.valueOf(i));
        }

        ArrayList<String> arList2 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arList2.add(String.valueOf(i));
        }


        System.out.println("\n\n removing everything");
        System.out.println("arList 1 before removing-> " + arList1);
        System.out.println("arList 2 before removing-> " + arList2);
        boolean removed = arList1.removeAll(arList2);
        System.out.println("arList 1 after removing(" + removed + ')' + arList1);
        System.out.println("arList 2 after removing" + arList2);

        System.out.println(arList1.indexOf("10") + " " + arList1.indexOf("16"));
        System.out.println(arList1.indexOf("10") + ' ' + arList1.indexOf("16"));
        System.out.println(arList1.indexOf("10") + "" + arList1.indexOf("16"));

    }
}