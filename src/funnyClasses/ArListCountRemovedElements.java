package funnyClasses;

import java.util.ArrayList;
import java.util.List;

public class ArListCountRemovedElements {

    List<Integer> arrayI;
    Integer removable;
    Integer amount;
    public ArListCountRemovedElements(){
    }
    public int amount(List<Integer> arrayI, Integer removable){

        List<Integer> arTemp = new ArrayList<>(arrayI);
        while(arTemp.contains(removable)){
            arTemp.remove(removable);
            if(arTemp.isEmpty()){
                break;
            }
        }
        return arrayI.size() - arTemp.size();
    }
}
