import java.util.*;

import funnyClasses.tasksFromYT.first.FirstTaskDoubleLoop;

public class Main {


    public static void main(String[] args) {

        ArrayList<Integer> lookingFrom = new ArrayList<>(Arrays.asList(1, 6, 4, 7, 10, 3, 2, 8, 7, 5, 9));

        FirstTaskDoubleLoop firstTaskDoubleLoop1 = new FirstTaskDoubleLoop(lookingFrom, 8);

        System.out.println(firstTaskDoubleLoop1.doubleLoopWithBool());
        System.out.println(firstTaskDoubleLoop1.doubleLoopWithGoTo());
        System.out.println(firstTaskDoubleLoop1.doubleLoop());

    }
}