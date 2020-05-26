import java.util.ArrayList;
import java.util.HashMap;


public class LabDictionary {
    public static void main(String[] args) {
        DictionaryOutput dictionaryOutput = new DictionaryOutput();
        HashMap<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
        for (int i = 0; i <30 ; i++) {
            dictionary.put(i,i);
        }
        int key = 11;
        dictionaryOutput.display(dictionary,key);
    }
}

class DictionaryOutput{
    public void display(HashMap<Integer,Integer> dictionary, int key){
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<Integer> trueKeys = new ArrayList<>();
        keys.addAll(dictionary.keySet());
        for (int i = 0; i <keys.size() ; i++) {
            if(keys.get(i) >=key)
                trueKeys.add(keys.get(i));
        }

        if(trueKeys.isEmpty())
            System.out.println("null");

        for(int i = 0; i< trueKeys.size();i++)
            System.out.println(trueKeys.get(i));

    }
}