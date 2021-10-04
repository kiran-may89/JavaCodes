import java.util.HashMap;
import java.util.Map;

public class DuplicateStrings {

    public static void main(String[] args){
     String s = "is this the way you is this is the way";
        Map<String, Integer> map = new HashMap<>();
        String[] split = s.split(" ");
        for (String value : split) {
            if (map.containsKey(value)) {
                Integer count = map.get(value);
                map.put(value, count + 1);
            } else {
                map.put(value, 1);
            }
        }

       for (Map.Entry<String, Integer> entry:map.entrySet()){
           //System.out.println(entry.getKey() + " - " + entry.getValue());
       }

       for (int i=0;i<split.length;i++){
           int count = 1;
           for(int j=i+1;j<split.length;j++){
              if(split[i].equals(split[j] )&& !split[i].isEmpty()){
                  count++;
                  split[j] = "";

              }

           }
           if(!split[i].isEmpty()){
               System.out.println(split[i] +" - "+ count);
           }

       }
    }
}
