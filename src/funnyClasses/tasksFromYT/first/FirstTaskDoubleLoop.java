package funnyClasses.tasksFromYT.first;


import java.util.ArrayList;
import java.util.List;

//we have a collection and int, we need to find any two numbers, sum of witch equals to int.
public class FirstTaskDoubleLoop {

    private List<Integer> col;
    private Integer lookedNumber;

    public FirstTaskDoubleLoop(ArrayList<Integer> col, Integer lookedNumber){
        this.col = col;
        this.lookedNumber = lookedNumber;
    }

    public List<Integer> doubleLoopWithGoTo(){
        List<Integer> returnInt = new ArrayList<>();

        endLoops:
        for(int i = 0; i < col.size(); i++){
            for(int j = i; j < col.size(); j++)
                if((col.get(i) + col.get(j)) == lookedNumber){
                 returnInt.add(i);
                 returnInt.add(j);
                 break endLoops;
                }
        }
        return returnInt;
    }

    public List<Integer> doubleLoopWithBool(){
        List<Integer> returnInt = new ArrayList<>();
        Boolean breakLoop = false;

        for(int i = 0; i < col.size() && !breakLoop; i++){
            for(int j = i; j < col.size(); j++)
                if((col.get(i) + col.get(j)) == lookedNumber){
                    returnInt.add(i);
                    returnInt.add(j);
                    breakLoop = true;
                    break;
                }
        }
        return returnInt;
    }


    //this method is massacre, but nothing new comes to my mind. let it be for now
    public List<Integer> doubleLoop(){
        List<Integer> returnInt = new ArrayList<>();

        for(int i = 0; i < col.size(); i++){
            if (doubleLoopInnerPart(i).size() > 0 && col.get(doubleLoopInnerPart(i).get(0)) + col.get(doubleLoopInnerPart(i).get(1)) == lookedNumber){
                returnInt = doubleLoopInnerPart(i);
                break;
            }
        }
        return returnInt;
    }

    private List<Integer> doubleLoopInnerPart(int i) {
        List<Integer> returnInt = new ArrayList<>();

        for(int j = i; j < col.size(); j++){
            if(col.get(j) + col.get(i) == lookedNumber){
                returnInt.add(i);
                returnInt.add(j);
                break;
            }
        }
        return returnInt;
    }

}
