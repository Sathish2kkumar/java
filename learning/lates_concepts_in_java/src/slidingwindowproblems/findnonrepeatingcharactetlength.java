package slidingwindowproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findnonrepeatingcharactetlength {
    public static void main(String[] args) {
      String data = "abcab";
      countofnonrepeatingcharacter(data);
        countingnonrepeatingvalueforsubcharacter(data);
    }
    public static int countofnonrepeatingcharacter(String a){
        int start = 0;
        int end = 0;
        int count = Math.min(1,a.length());
        int ouput = 0;
        Set<Character> abc = new HashSet<>();
        for(int i=0;i<a.length();i++){
            if(abc.contains(a.charAt(i))){
                abc.remove(a.charAt(i));
                start++;
            }
                abc.add(a.charAt(i));
                end++;
            System.out.println("endvalue"+start);
            int value = end-start;
            System.out.println("printingoutput"+value);
             ouput = Math.max(count,value);

        }
        System.out.println(ouput);
        return ouput;
    }
    public static int countingnonrepeatingvalueforsubcharacter(String a){
        int duplicatevalues = 0;
        Map<Character,Integer> inputdata = new HashMap<>();
        for(int i=0;i<a.length();i++){
            if(inputdata.containsKey(a.charAt(i))){
                inputdata.put(a.charAt(i),inputdata.get(a.charAt(i))+1);
            }
            else{
                inputdata.put(a.charAt(i),1);
            }
        }
        System.out.println(inputdata);
        duplicatevalues = inputdata.entrySet().stream().filter(b->b.getValue()>1).mapToInt(Map.Entry::getValue).sum();
        System.out.println(duplicatevalues);
        return 1;
    }
}
