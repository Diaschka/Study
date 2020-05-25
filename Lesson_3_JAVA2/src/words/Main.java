package words;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[]{"Alex","Sofia","Noa","Gabriel","Elena","Alex","Maria","James","Peter","Katerina","Peter","Alex","John"};
        ArrayList<String> namesArray = new ArrayList<>(Arrays.asList(names));
        //System.out.println(namesArray);

        // unique names
        Set<String> namesSet = new HashSet<>();
        namesSet.addAll(Arrays.asList(names));
        System.out.println("Unique names: "+ namesSet);

        //repeated names
         for (String value: namesSet) {
              int count = 0;
              for (int i = 0; i < namesArray.size(); i++) {
                  String name = namesArray.get(i);
                  if(value.equals(name)){
                  count++;
                  }
              }
             System.out.println("Name " + value + " is repeated " + count + " time(s).");
         }
    }
}
