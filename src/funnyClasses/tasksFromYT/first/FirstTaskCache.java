package funnyClasses.tasksFromYT.first;

import java.util.ArrayList;
import java.util.List;

public class FirstTaskCache {

    List<Integer> col;
    Integer lookingFor;

    public FirstTaskCache(List<Integer> col, Integer lookingFor){
        this.col = col;
        this.lookingFor = lookingFor;
    }

    public List<Integer> cachResult(){
        List<Integer> cachList = new ArrayList<>();
        List<Integer> returnList = new ArrayList<>();

        for(int i = 0; i < col.size(); i++){
            int number = col.get(i);
            cachList.add(lookingFor - number);

            if(cachList.indexOf(number) != i && cachList.contains(number)){
                returnList.add(cachList.indexOf(number));
                returnList.add(i);
                break;
            }
        }
        return returnList;
    }
}